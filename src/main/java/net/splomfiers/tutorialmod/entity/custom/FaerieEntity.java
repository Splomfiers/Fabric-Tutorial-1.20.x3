package net.splomfiers.tutorialmod.entity.custom;

import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import net.splomfiers.tutorialmod.entity.ModEntities;
import org.jetbrains.annotations.Nullable;

public class FaerieEntity extends AnimalEntity {

    private static final TrackedData<Boolean> ATTACKING =
            DataTracker.registerData(FaerieEntity.class, TrackedDataHandlerRegistry.BOOLEAN);


    public FaerieEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    public final AnimationState attackAnimationState = new AnimationState();
    public int attackAnimationTimeout = 0;



    private void setupAnimationStates(){
         if(this.idleAnimationTimeout <= 0){
            this.idleAnimationTimeout= this.random.nextInt(40) + 80;
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationTimeout;
        }
        if(this.isAttacking() && attackAnimationTimeout <= 0) {
            attackAnimationTimeout = 40;
            attackAnimationState.start(this.age);
        } else {
            --this.attackAnimationTimeout;
        }

        if(!this.isAttacking()){
            attackAnimationState.stop();
        }

    }
    @Override
    protected void updateLimbs(float posDelta){
        float f = this.getPose() == EntityPose.STANDING ? Math.min(posDelta + 6.0f,1.0f): 0.0f;
        this.limbAnimator.updateLimbs(f, 0.2f);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.getWorld().isClient()) {
            setupAnimationStates();
        }
    }

    @Override
protected void initGoals() {
    this.goalSelector.add(0, new SwimGoal(this));
    this.goalSelector.add(1, new TemptGoal(this, 1.25D, Ingredient.ofItems(Items.DARK_OAK_SAPLING), false));
    this.goalSelector.add(2, new WanderAroundFarGoal(this,1D));
    this.goalSelector.add(3, new LookAtEntityGoal( this, PlayerEntity.class, 4f));
    this.goalSelector.add(4, new LookAroundGoal(this));
    this.goalSelector.add(5, new AnimalMateGoal(this,1.15D));

    this.targetSelector.add(1, new RevengeGoal(this));
}


public static DefaultAttributeContainer.Builder createFaerieAttributes() {
    return MobEntity.createMobAttributes()
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.1f)
            .add(EntityAttributes.GENERIC_MAX_HEALTH,15)
            .add(EntityAttributes.GENERIC_ATTACK_DAMAGE,1);
}
    public void setAttacking(boolean attacking) {
        this.dataTracker.set(ATTACKING, attacking);
    }

    @Override
    public boolean isAttacking() {
        return this.dataTracker.get(ATTACKING);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(ATTACKING, false); }

        @Override
        public boolean isBreedingItem (ItemStack stack){
            return stack.isOf(Items.DARK_OAK_SAPLING);
        }



    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return ModEntities.FAERIE.create(world);
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_ALLAY_AMBIENT_WITH_ITEM;
    }
    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_ALLAY_HURT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_ALLAY_DEATH;
    }
}
