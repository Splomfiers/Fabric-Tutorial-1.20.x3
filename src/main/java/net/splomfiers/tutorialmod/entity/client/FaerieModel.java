package net.splomfiers.tutorialmod.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.splomfiers.tutorialmod.entity.animation.ModAnimations;
import net.splomfiers.tutorialmod.entity.custom.FaerieEntity;

public class FaerieModel <T extends FaerieEntity> extends SinglePartEntityModel<T> {
	private final ModelPart Faerie;
	private final ModelPart head;

	public FaerieModel(ModelPart root) {

		this.Faerie= root.getChild("faerie");
		this.head = Faerie.getChild("allbody").getChild("chest").getChild("head");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Faerie = modelPartData.addChild("faerie", ModelPartBuilder.create(), ModelTransform.of(-1.0F, 15.0F, -4.0F, 0.0F, 1.5708F, 0.0F));

		ModelPartData allbody = Faerie.addChild("allbody", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -7.0F, 0.0F));

		ModelPartData chest = allbody.addChild("chest", ModelPartBuilder.create().uv(0, 9).cuboid(-2.0F, -3.0F, -3.0F, 5.0F, 7.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 1.0F, 0.0F));

		ModelPartData head = chest.addChild("head", ModelPartBuilder.create().uv(15, 16).cuboid(-3.0F, -4.0F, -2.0F, 4.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, -5.0F, -1.0F));

		ModelPartData crown = head.addChild("crown", ModelPartBuilder.create().uv(17, 0).cuboid(-3.0F, 2.0F, -1.0F, 6.0F, 1.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, -7.0F, -1.0F));

		ModelPartData cube_r1 = crown.addChild("cube_r1", ModelPartBuilder.create().uv(1, 1).cuboid(-0.622F, -3.3452F, -0.4812F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -1.0F, 3.0F, -0.122F, 0.04F, -1.6528F));

		ModelPartData cube_r2 = crown.addChild("cube_r2", ModelPartBuilder.create().uv(1, 1).cuboid(-0.9465F, -2.5763F, -1.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.7017F));

		ModelPartData cube_r3 = crown.addChild("cube_r3", ModelPartBuilder.create().uv(1, 1).cuboid(-4.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, -1.0F, 3.0F, 0.1309F, 0.0F, -0.829F));

		ModelPartData cube_r4 = crown.addChild("cube_r4", ModelPartBuilder.create().uv(1, 1).cuboid(-4.0F, -3.0F, 0.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, -1.0F, -1.0F, 0.0F, 0.0F, -0.7418F));

		ModelPartData cube_r5 = crown.addChild("cube_r5", ModelPartBuilder.create().uv(1, 1).cuboid(-1.0F, 2.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(1, 1).cuboid(-1.0F, 1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(1, 1).cuboid(-1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(1, 1).cuboid(-1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(1, 1).cuboid(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 3.0F, 1.0F, 2.3562F, 0.0F, 0.0F));

		ModelPartData cube_r6 = crown.addChild("cube_r6", ModelPartBuilder.create().uv(37, 36).cuboid(-13.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, 1.0F, 1.0F, 1.9635F, 0.0F, 0.0F));

		ModelPartData cube_r7 = crown.addChild("cube_r7", ModelPartBuilder.create().uv(7, 21).cuboid(-9.0F, 1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, 1.0F, 1.0F, 1.1345F, 0.0F, 0.0F));

		ModelPartData cube_r8 = crown.addChild("cube_r8", ModelPartBuilder.create().uv(38, 30).cuboid(-13.0F, 1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, 1.0F, 1.0F, 1.1781F, 0.0F, 0.0F));

		ModelPartData cube_r9 = crown.addChild("cube_r9", ModelPartBuilder.create().uv(34, 0).cuboid(-9.0F, -1.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(10.0F, 1.0F, 1.0F, 2.0944F, 0.0F, 0.0F));

		ModelPartData hair = head.addChild("hair", ModelPartBuilder.create().uv(0, 21).cuboid(1.0F, 0.0F, -3.0F, 1.0F, 5.0F, 5.0F, new Dilation(0.0F))
				.uv(26, 26).cuboid(1.0F, -1.0F, 2.0F, 6.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, -4.0F, 1.0F));

		ModelPartData cube_r10 = hair.addChild("cube_r10", ModelPartBuilder.create().uv(52, 47).cuboid(-2.0F, 1.0F, 1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(52, 51).cuboid(-2.0F, 1.0F, 7.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(36, 47).cuboid(-2.0F, -5.0F, 7.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
				.uv(40, 47).cuboid(-2.0F, -5.0F, 1.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(9.0F, 4.0F, -5.0F, 0.0F, 0.0F, -0.1309F));

		ModelPartData cube_r11 = hair.addChild("cube_r11", ModelPartBuilder.create().uv(30, 10).cuboid(0.3303F, -0.7817F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, -1.0F, -4.0F, 0.0F, 0.0F, -0.2182F));

		ModelPartData cube_r12 = hair.addChild("cube_r12", ModelPartBuilder.create().uv(3, 8).cuboid(0.1484F, -0.0071F, -6.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(3, 20).cuboid(0.1484F, -0.0071F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -2.0F, 2.0F, 0.0F, 0.0F, 0.1745F));

		ModelPartData cube_r13 = hair.addChild("cube_r13", ModelPartBuilder.create().uv(20, 13).cuboid(0.3303F, -0.7817F, -1.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, -1.0F, 3.0F, 0.0F, 0.0F, -0.2618F));

		ModelPartData cube_r14 = hair.addChild("cube_r14", ModelPartBuilder.create().uv(39, 14).cuboid(-2.0684F, 0.0442F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 9).cuboid(-2.0684F, 0.0442F, 1.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(20, 50).cuboid(-2.0684F, 0.0442F, 2.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(45, 40).cuboid(-2.0684F, 0.0442F, 3.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
				.uv(50, 23).cuboid(-2.0684F, 0.0442F, 4.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(17, 0).cuboid(-2.0684F, 0.0442F, 5.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(53, 40).cuboid(-2.0684F, 0.0442F, 6.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(49, 37).cuboid(-2.0684F, -4.9558F, 1.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(50, 6).cuboid(-2.0684F, -4.9558F, 2.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(12, 50).cuboid(-2.0684F, -4.9558F, 3.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(16, 50).cuboid(-2.0684F, -4.9558F, 4.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(49, 31).cuboid(-3.0684F, -3.9558F, 5.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(50, 17).cuboid(-2.0684F, -4.9558F, 5.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(46, 19).cuboid(-2.0684F, -4.9558F, 6.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
				.uv(47, 11).cuboid(-2.0684F, -4.9558F, 0.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 4.0F, -4.0F, 0.0F, 0.0F, 0.2618F));

		ModelPartData cube_r15 = hair.addChild("cube_r15", ModelPartBuilder.create().uv(44, 50).cuboid(-1.1366F, -2.4734F, -3.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 4.0F, 1.0F, 0.5236F, 0.0F, 0.2182F));

		ModelPartData cube_r16 = hair.addChild("cube_r16", ModelPartBuilder.create().uv(48, 50).cuboid(-1.1366F, -2.4734F, -2.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 4.0F, 1.0F, 0.3054F, 0.0F, 0.2182F));

		ModelPartData cube_r17 = hair.addChild("cube_r17", ModelPartBuilder.create().uv(0, 51).cuboid(-1.1366F, -2.4734F, -1.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 4.0F, 1.0F, -0.3491F, 0.0F, 0.2182F));

		ModelPartData cube_r18 = hair.addChild("cube_r18", ModelPartBuilder.create().uv(43, 13).cuboid(-1.5481F, -4.3763F, 0.5274F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(8.0F, 3.0F, 5.0F, 1.1512F, -1.2234F, -1.1603F));

		ModelPartData cube_r19 = hair.addChild("cube_r19", ModelPartBuilder.create().uv(24, 43).cuboid(-0.44F, -4.5908F, -1.0662F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 3.0F, -5.0F, -1.2087F, -1.1685F, 1.2489F));

		ModelPartData cube_r20 = hair.addChild("cube_r20", ModelPartBuilder.create().uv(12, 43).cuboid(-0.3716F, -4.3205F, -0.0748F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 3.0F, 3.0F, 0.9639F, -1.3479F, -0.9778F));

		ModelPartData cube_r21 = hair.addChild("cube_r21", ModelPartBuilder.create().uv(28, 43).cuboid(-0.1879F, -4.5951F, -2.0502F, 1.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 3.0F, -5.0F, -1.2062F, -1.2094F, 1.2257F));

		ModelPartData cube_r22 = hair.addChild("cube_r22", ModelPartBuilder.create().uv(8, 42).cuboid(-0.2369F, -4.2889F, -0.1929F, 1.0F, 9.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, 3.0F, 4.0F, 1.1815F, -1.2322F, -1.2038F));

		ModelPartData cube_r23 = hair.addChild("cube_r23", ModelPartBuilder.create().uv(32, 43).cuboid(-0.1879F, -3.5951F, -1.0502F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 3.0F, -5.0F, -1.2062F, -1.2094F, 1.2257F));

		ModelPartData cube_r24 = hair.addChild("cube_r24", ModelPartBuilder.create().uv(41, 40).cuboid(-1.7454F, -6.5738F, -0.5653F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 4.0F, 7.0F, 1.3258F, -1.0243F, -1.3625F));

		ModelPartData cube_r25 = hair.addChild("cube_r25", ModelPartBuilder.create().uv(0, 44).cuboid(-1.1879F, -3.5951F, -0.0502F, 1.0F, 8.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 3.0F, -5.0F, -1.2062F, -1.2094F, 1.2257F));

		ModelPartData cube_r26 = hair.addChild("cube_r26", ModelPartBuilder.create().uv(37, 40).cuboid(8.1904F, -1.9899F, 0.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
				.uv(37, 40).cuboid(8.1904F, 4.0101F, 0.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 3.0F, -5.0F, 1.1898F, -1.2153F, -1.0818F));

		ModelPartData cube_r27 = hair.addChild("cube_r27", ModelPartBuilder.create().uv(20, 43).cuboid(0.1904F, 0.0101F, -2.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
				.uv(45, 33).cuboid(0.1904F, -3.9899F, 0.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 3.0F, -5.0F, -0.1309F, -1.4399F, 0.2618F));

		ModelPartData cube_r28 = hair.addChild("cube_r28", ModelPartBuilder.create().uv(4, 44).cuboid(0.1904F, -3.9899F, -2.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 3.0F, -5.0F, -1.1282F, -1.2638F, 1.2763F));

		ModelPartData cube_r29 = hair.addChild("cube_r29", ModelPartBuilder.create().uv(16, 43).cuboid(-0.8096F, -0.9899F, -1.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 3.0F, -5.0F, -0.6741F, -1.4044F, 0.8106F));

		ModelPartData cube_r30 = hair.addChild("cube_r30", ModelPartBuilder.create().uv(51, 12).cuboid(-0.8096F, -2.9899F, -1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 3.0F, -5.0F, -0.9703F, -1.3397F, 1.1125F));

		ModelPartData cube_r31 = hair.addChild("cube_r31", ModelPartBuilder.create().uv(44, 5).cuboid(0.1904F, -3.9899F, -1.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 3.0F, -5.0F, -1.0606F, -1.3026F, 1.2057F));

		ModelPartData cube_r32 = hair.addChild("cube_r32", ModelPartBuilder.create().uv(12, 26).cuboid(-5.0852F, -2.8829F, 0.4398F, 6.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 3.0F, 1.0F, 0.2629F, -0.017F, -0.1298F));

		ModelPartData cube_r33 = hair.addChild("cube_r33", ModelPartBuilder.create().uv(12, 26).cuboid(-6.0426F, -3.3584F, -2.5961F, 6.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, 3.0F, -1.0F, -0.3043F, -0.017F, -0.1298F));

		ModelPartData cube_r34 = hair.addChild("cube_r34", ModelPartBuilder.create().uv(12, 26).cuboid(-5.1022F, -2.7104F, -0.545F, 6.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 3.0F, 2.0F, -0.1734F, -0.017F, -0.1298F));

		ModelPartData cube_r35 = hair.addChild("cube_r35", ModelPartBuilder.create().uv(12, 26).cuboid(-5.0341F, -4.2368F, -1.8483F, 6.0F, 7.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 3.0F, -2.0F, -0.2601F, -0.0357F, -0.1703F));

		ModelPartData cube_r36 = hair.addChild("cube_r36", ModelPartBuilder.create().uv(12, 26).cuboid(-5.0F, -4.0F, 0.0F, 6.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 3.0F, -4.0F, -0.3916F, -0.017F, -0.1298F));

		ModelPartData neck = head.addChild("neck", ModelPartBuilder.create().uv(30, 14).cuboid(-1.0F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 2.0F, 1.0F));

		ModelPartData wingbone = chest.addChild("wingbone", ModelPartBuilder.create(), ModelTransform.pivot(-3.6426F, 0.0F, -2.4094F));

		ModelPartData cube_r37 = wingbone.addChild("cube_r37", ModelPartBuilder.create().uv(49, 43).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F));

		ModelPartData rightwings = wingbone.addChild("rightwings", ModelPartBuilder.create().uv(49, 62).cuboid(-0.0937F, -1.0F, -0.4226F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(28, 61).cuboid(-0.0937F, 1.0F, -0.4226F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(24, 61).cuboid(-1.0937F, 1.0F, 0.5774F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(57, 8).cuboid(-0.0937F, 1.0F, 0.5774F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(20, 61).cuboid(-1.0937F, 2.0F, 1.5774F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(56, 31).cuboid(-0.0937F, 2.0F, 1.5774F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(27, 58).cuboid(-0.0937F, 2.0F, 2.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(23, 58).cuboid(-0.0937F, 2.0F, 3.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(19, 58).cuboid(-0.0937F, 3.0F, 3.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(16, 61).cuboid(-1.0937F, 3.0F, 2.5774F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(56, 35).cuboid(-0.0937F, 3.0F, 2.5774F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(61, 11).cuboid(-1.0937F, 4.0F, 3.5774F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(56, 39).cuboid(-0.0937F, 4.0F, 3.5774F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(39, 62).cuboid(-1.0937F, -1.0F, 0.5774F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(57, 16).cuboid(-0.0937F, -1.0F, 0.5774F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(27, 39).cuboid(-0.0937F, 0.0F, 0.5774F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(18, 39).cuboid(-1.0937F, 0.0F, 0.5774F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(62, 13).cuboid(-1.0937F, -2.0F, 1.5774F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(57, 19).cuboid(-0.0937F, -2.0F, 1.5774F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(13, 62).cuboid(-1.0937F, -3.0F, 2.5774F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(57, 21).cuboid(-0.0937F, -3.0F, 2.5774F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(9, 62).cuboid(-1.0937F, -4.0F, 3.5774F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(57, 23).cuboid(-0.0937F, -4.0F, 3.5774F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(58, 42).cuboid(-0.0937F, 4.0F, 4.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(39, 58).cuboid(-0.0937F, 3.0F, 4.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(35, 58).cuboid(-0.0937F, 3.0F, 5.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(31, 58).cuboid(-0.0937F, 4.0F, 5.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(15, 42).cuboid(-0.0937F, 5.0F, 5.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(58, 11).cuboid(-0.0937F, 4.0F, 6.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(57, 17).cuboid(-0.0937F, 3.0F, 6.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(12, 57).cuboid(-0.0937F, 2.0F, 6.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(47, 3).cuboid(-0.0937F, 1.0F, 6.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(3, 43).cuboid(-0.0937F, 0.0F, 6.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(57, 4).cuboid(-0.0937F, 2.0F, 5.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(19, 49).cuboid(-0.0937F, 1.0F, 5.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(57, 1).cuboid(-0.0937F, 2.0F, 4.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(52, 56).cuboid(-0.0937F, 1.0F, 4.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(56, 48).cuboid(-0.0937F, 0.0F, 4.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(43, 46).cuboid(-0.0937F, 0.0F, 5.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(39, 46).cuboid(-0.0937F, -1.0F, 5.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(35, 42).cuboid(-0.0937F, -1.0F, 6.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(34, 0).cuboid(-0.0937F, -1.0F, 6.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(51, 15).cuboid(-0.0937F, -3.0F, 3.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(51, 28).cuboid(-0.0937F, -2.0F, 3.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(31, 49).cuboid(-0.0937F, -1.0F, 1.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(23, 49).cuboid(-0.0937F, -2.0F, 2.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(27, 49).cuboid(-0.0937F, -1.0F, 2.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(49, 28).cuboid(-0.0937F, 0.0F, 2.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(47, 49).cuboid(-0.0937F, 0.0F, 1.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(50, 0).cuboid(-0.0937F, 1.0F, 1.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(3, 50).cuboid(-0.0937F, 1.0F, 2.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(50, 46).cuboid(-0.0937F, 1.0F, 3.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(50, 47).cuboid(-0.0937F, 0.0F, 3.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(51, 29).cuboid(-0.0937F, -1.0F, 3.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(56, 15).cuboid(-0.0937F, -1.0F, 4.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(49, 55).cuboid(-0.0937F, -2.0F, 4.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(55, 46).cuboid(-0.0937F, -2.0F, 5.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(46, 30).cuboid(-0.0937F, -2.0F, 6.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(45, 55).cuboid(-0.0937F, -3.0F, 5.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(53, 3).cuboid(-0.0937F, -4.0F, 5.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(54, 42).cuboid(-0.0937F, -3.0F, 6.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(54, 11).cuboid(-0.0937F, -4.0F, 6.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(11, 55).cuboid(-0.0937F, -4.0F, 8.5774F, 0.0F, 1.0F, 0.0F, new Dilation(0.0F))
				.uv(38, 52).cuboid(-0.0937F, -5.0F, 7.5774F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(44, 39).cuboid(-0.0937F, -5.0F, 6.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(43, 33).cuboid(-0.0937F, -5.0F, 8.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(13, 55).cuboid(-0.0937F, -3.0F, 4.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(46, 2).cuboid(-0.0937F, -4.0F, 4.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(58, 6).cuboid(-0.0937F, 4.0F, 7.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(40, 23).cuboid(-0.0937F, 4.0F, 8.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(16, 57).cuboid(-0.0937F, 3.0F, 7.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(18, 40).cuboid(-0.0937F, 3.0F, 8.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(48, 9).cuboid(-0.0937F, 2.0F, 7.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(6, 40).cuboid(-0.0937F, 2.0F, 8.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(43, 4).cuboid(-0.0937F, 1.0F, 7.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(55, 57).cuboid(-0.0937F, 5.0F, 7.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(15, 49).cuboid(-0.0937F, 5.0F, 6.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(48, 30).cuboid(-0.0937F, 7.0F, 6.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(41, 18).cuboid(-0.0937F, 8.0F, 6.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(41, 17).cuboid(-0.0937F, 8.0F, 7.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(48, 25).cuboid(-0.0937F, 7.0F, 7.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(48, 26).cuboid(-0.0937F, 6.0F, 6.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(44, 57).cuboid(-0.0937F, 6.0F, 7.5774F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.6426F, 0.0F, 2.4094F, 0.0F, -0.4363F, 0.0F));

		ModelPartData cube_r38 = rightwings.addChild("cube_r38", ModelPartBuilder.create().uv(40, 39).cuboid(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(11, 41).cuboid(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0937F, 7.0F, 8.5774F, 0.5672F, 0.0F, 0.0F));

		ModelPartData cube_r39 = rightwings.addChild("cube_r39", ModelPartBuilder.create().uv(41, 7).cuboid(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0937F, 8.0F, 8.5774F, -1.0036F, 0.0436F, 0.0F));

		ModelPartData cube_r40 = rightwings.addChild("cube_r40", ModelPartBuilder.create().uv(41, 9).cuboid(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0937F, 9.0F, 8.5774F, 0.5672F, 0.0F, 0.0F));

		ModelPartData cube_r41 = rightwings.addChild("cube_r41", ModelPartBuilder.create().uv(27, 42).cuboid(0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(23, 42).cuboid(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(31, 42).cuboid(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0937F, 6.0F, 6.5774F, 0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r42 = rightwings.addChild("cube_r42", ModelPartBuilder.create().uv(47, 17).cuboid(0.0F, 0.0F, -2.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(47, 31).cuboid(0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(48, 8).cuboid(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0937F, 4.0F, 9.5774F, 0.5672F, 0.0F, 0.0F));

		ModelPartData cube_r43 = rightwings.addChild("cube_r43", ModelPartBuilder.create().uv(39, 24).cuboid(0.0F, -3.0F, 1.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(34, 17).cuboid(0.0F, -2.0F, 2.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(39, 1).cuboid(0.0F, -2.0F, 1.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(43, 22).cuboid(0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(43, 27).cuboid(0.0F, -2.0F, -1.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(44, 0).cuboid(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(6, 39).cuboid(0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(44, 2).cuboid(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0937F, -5.0F, 6.5774F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r44 = rightwings.addChild("cube_r44", ModelPartBuilder.create().uv(35, 38).cuboid(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0937F, -3.0F, 9.5774F, -2.3998F, 0.0F, 0.0F));

		ModelPartData cube_r45 = rightwings.addChild("cube_r45", ModelPartBuilder.create().uv(38, 33).cuboid(1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0937F, -3.0F, 9.5774F, 0.7418F, 0.0F, 0.0F));

		ModelPartData cube_r46 = rightwings.addChild("cube_r46", ModelPartBuilder.create().uv(34, 1).cuboid(0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0937F, -3.0F, 9.5774F, -0.7418F, 0.0F, 0.0F));

		ModelPartData cube_r47 = rightwings.addChild("cube_r47", ModelPartBuilder.create().uv(35, 39).cuboid(0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 40).cuboid(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0937F, -4.0F, 6.5774F, -0.5672F, 0.0F, 0.0F));

		ModelPartData cube_r48 = rightwings.addChild("cube_r48", ModelPartBuilder.create().uv(34, 18).cuboid(-1.0F, 0.0F, -1.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.9063F, -2.0F, 8.5774F, -0.5672F, 0.0F, 0.0F));

		ModelPartData cube_r49 = rightwings.addChild("cube_r49", ModelPartBuilder.create().uv(42, 56).cuboid(-5.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(6, 61).cuboid(-6.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(6, 57).cuboid(-5.0F, -4.0F, 5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(60, 40).cuboid(-6.0F, -4.0F, 5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(57, 0).cuboid(-5.0F, -3.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(60, 42).cuboid(-6.0F, -3.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 57).cuboid(-5.0F, -2.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(51, 60).cuboid(-6.0F, -2.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(54, 56).cuboid(-5.0F, -1.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 61).cuboid(-6.0F, -1.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(56, 52).cuboid(-5.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(61, 0).cuboid(-6.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(56, 47).cuboid(-5.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(61, 4).cuboid(-6.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(46, 56).cuboid(-5.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(61, 9).cuboid(-6.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(4.9063F, 9.0F, 7.5774F, 0.6109F, 0.0F, 0.0F));

		ModelPartData cube_r50 = rightwings.addChild("cube_r50", ModelPartBuilder.create().uv(57, 57).cuboid(0.0F, -0.4131F, -0.6533F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(3, 58).cuboid(0.0F, -1.4131F, -0.6533F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(58, 5).cuboid(0.0F, -2.4131F, -0.6533F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(9, 58).cuboid(0.0F, -3.4131F, -0.6533F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(60, 24).cuboid(-1.0F, -3.4131F, -0.6533F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(60, 36).cuboid(-1.0F, -2.4131F, -0.6533F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(60, 38).cuboid(-1.0F, -1.4131F, -0.6533F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(39, 60).cuboid(-1.0F, -0.4131F, -0.6533F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0937F, 2.0F, 9.5774F, 0.8727F, 0.0F, 0.0F));

		ModelPartData cube_r51 = rightwings.addChild("cube_r51", ModelPartBuilder.create().uv(58, 10).cuboid(-1.0F, 2.3628F, -0.5845F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(60, 26).cuboid(0.0F, 2.3628F, -0.5845F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(13, 58).cuboid(0.0F, 1.3628F, -0.5845F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(60, 28).cuboid(-1.0F, 1.3628F, -0.5845F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(60, 30).cuboid(-1.0F, 0.3628F, -0.5845F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(41, 58).cuboid(0.0F, -0.6372F, -0.5845F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(60, 32).cuboid(-1.0F, -0.6372F, -0.5845F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0937F, -2.0F, 9.5774F, -0.9599F, 0.0F, 0.0F));

		ModelPartData cube_r52 = rightwings.addChild("cube_r52", ModelPartBuilder.create().uv(58, 13).cuboid(0.0F, -23.3926F, 16.0493F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0937F, -2.0F, -19.4226F, -0.9599F, 0.0F, 0.0F));

		ModelPartData cube_r53 = rightwings.addChild("cube_r53", ModelPartBuilder.create().uv(58, 44).cuboid(0.0F, -0.2244F, -0.5228F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(60, 34).cuboid(-1.0F, -0.2244F, -0.5228F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0937F, -3.0F, 10.5774F, -0.829F, 0.0F, 0.0F));

		ModelPartData cube_r54 = rightwings.addChild("cube_r54", ModelPartBuilder.create().uv(45, 58).cuboid(0.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(32, 61).cuboid(-1.0F, 0.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(49, 57).cuboid(0.0F, -1.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(36, 61).cuboid(-1.0F, -1.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(57, 41).cuboid(0.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(46, 61).cuboid(-1.0F, -2.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(57, 37).cuboid(0.0F, -3.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(61, 48).cuboid(-1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(57, 33).cuboid(0.0F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(54, 61).cuboid(-1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(57, 29).cuboid(0.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(61, 56).cuboid(-1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(57, 27).cuboid(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(58, 61).cuboid(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0937F, -7.0F, 6.5774F, -0.5672F, 0.0F, 0.0F));

		ModelPartData cube_r55 = rightwings.addChild("cube_r55", ModelPartBuilder.create().uv(53, 28).cuboid(0.0F, -4.0F, 0.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(54, 5).cuboid(-1.0F, -4.0F, 0.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0937F, -4.0F, 4.5774F, -0.5236F, 0.0F, 0.0F));

		ModelPartData cube_r56 = rightwings.addChild("cube_r56", ModelPartBuilder.create().uv(57, 25).cuboid(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(3, 62).cuboid(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.0937F, -4.0F, 4.5774F, -0.2618F, 0.0F, 0.0F));

		ModelPartData cube_r57 = rightwings.addChild("cube_r57", ModelPartBuilder.create().uv(28, 50).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(28, 50).cuboid(1.0F, -1.0F, -1.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(53, 36).cuboid(0.0F, 1.0F, -1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0937F, 5.0F, 5.5774F, 0.3927F, 0.0F, 0.0F));

		ModelPartData leftwings = wingbone.addChild("leftwings", ModelPartBuilder.create().uv(60, 20).cuboid(-1.2113F, 0.0436F, -0.3288F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(60, 22).cuboid(-2.2113F, 0.0436F, -1.3288F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(7, 55).cuboid(-1.2113F, 0.0436F, -1.3288F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(60, 17).cuboid(-2.2113F, 1.0436F, -2.3288F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(55, 12).cuboid(-1.2113F, 1.0436F, -2.3288F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(60, 15).cuboid(-2.2113F, 2.0436F, -3.3288F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(55, 14).cuboid(-1.2113F, 2.0436F, -3.3288F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(13, 60).cuboid(-2.2113F, 3.0436F, -4.3288F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(55, 43).cuboid(-1.2113F, 3.0436F, -4.3288F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(43, 62).cuboid(-2.2113F, -0.9564F, -1.3288F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(43, 62).cuboid(-1.2113F, -0.9564F, -1.3288F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(30, 33).cuboid(-2.2113F, -1.9564F, -1.3288F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(62, 44).cuboid(-1.2113F, -1.9564F, -0.3288F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(62, 44).cuboid(-1.2113F, -1.9564F, -1.3288F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(59, 59).cuboid(-2.2113F, -2.9564F, -2.3288F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(59, 59).cuboid(-1.2113F, -2.9564F, -2.3288F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(55, 59).cuboid(-2.2113F, -3.9564F, -3.3288F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(54, 26).cuboid(-1.2113F, -3.9564F, -3.3288F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(54, 24).cuboid(-1.2113F, -4.9564F, -4.3288F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(59, 51).cuboid(-2.2113F, -4.9564F, -4.3288F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.6426F, 1.0F, 0.4094F, 0.0532F, 0.6102F, 0.0305F));

		ModelPartData cube_r58 = leftwings.addChild("cube_r58", ModelPartBuilder.create().uv(0, 21).cuboid(0.9055F, -1.303F, -0.1487F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(4, 51).cuboid(-0.0945F, -1.303F, -0.1487F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.2113F, 0.0436F, -8.3288F, -0.7437F, 0.0498F, 0.0411F));

		ModelPartData cube_r59 = leftwings.addChild("cube_r59", ModelPartBuilder.create().uv(24, 50).cuboid(-5.0F, -3.0F, -1.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(32, 50).cuboid(-6.0F, -3.0F, -1.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(3.7887F, -1.9564F, -8.3288F, 0.8271F, 0.0498F, 0.0411F));

		ModelPartData cube_r60 = leftwings.addChild("cube_r60", ModelPartBuilder.create().uv(53, 16).cuboid(0.0F, -1.0038F, 4.9128F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(16, 59).cuboid(-1.0F, -1.0038F, 4.9128F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(40, 34).cuboid(0.0F, -4.0038F, 1.9128F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(0, 59).cuboid(-1.0F, -4.0038F, 1.9128F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(41, 11).cuboid(0.0F, -3.0038F, 2.9128F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(59, 2).cuboid(-1.0F, -3.0038F, 2.9128F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(43, 31).cuboid(0.0F, -2.0038F, 3.9128F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(6, 59).cuboid(-1.0F, -2.0038F, 3.9128F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(53, 22).cuboid(0.0F, -1.0038F, 3.9128F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(20, 59).cuboid(-1.0F, -1.0038F, 3.9128F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(24, 59).cuboid(-1.0F, -1.0038F, 2.9128F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(54, 18).cuboid(0.0F, -0.0038F, 2.9128F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(28, 59).cuboid(-1.0F, -0.0038F, 2.9128F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(39, 1).cuboid(0.0F, 0.9962F, -0.0872F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
				.uv(13, 39).cuboid(-1.0F, 0.9962F, -0.0872F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.2113F, -4.9564F, -6.3288F, 2.1809F, 0.0108F, 0.0041F));

		ModelPartData cube_r61 = leftwings.addChild("cube_r61", ModelPartBuilder.create().uv(40, 28).cuboid(0.0F, -3.0038F, -4.0872F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(58, 55).cuboid(-1.0F, -3.0038F, -4.0872F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.2113F, -4.9564F, -6.3288F, 0.8719F, 0.0108F, 0.0041F));

		ModelPartData cube_r62 = leftwings.addChild("cube_r62", ModelPartBuilder.create().uv(54, 20).cuboid(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(48, 59).cuboid(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.2113F, -4.9564F, -5.3288F, 1.6581F, 0.0F, 0.0F));

		ModelPartData cube_r63 = leftwings.addChild("cube_r63", ModelPartBuilder.create().uv(3, 56).cuboid(1.1673F, 0.6218F, -1.7162F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(59, 46).cuboid(0.1673F, 0.6218F, -1.7162F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(51, 55).cuboid(1.1673F, -3.3782F, -6.7162F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(58, 49).cuboid(0.1673F, -3.3782F, -6.7162F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(14, 33).cuboid(1.1673F, -2.3782F, -5.7162F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(22, 33).cuboid(0.1673F, -2.3782F, -5.7162F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(14, 56).cuboid(1.1673F, -1.3782F, -4.7162F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(52, 58).cuboid(0.1673F, -1.3782F, -4.7162F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(10, 56).cuboid(1.1673F, -0.3782F, -3.7162F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(32, 59).cuboid(0.1673F, -0.3782F, -3.7162F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(56, 3).cuboid(1.1673F, 0.6218F, -2.7162F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(36, 59).cuboid(0.1673F, 0.6218F, -2.7162F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(55, 54).cuboid(1.1673F, 0.6218F, -0.7162F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(3, 60).cuboid(0.1673F, 0.6218F, -0.7162F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(55, 50).cuboid(1.1673F, -0.3782F, -0.7162F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(60, 7).cuboid(0.1673F, -0.3782F, -0.7162F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.2113F, 8.0436F, -6.3288F, -0.5674F, 0.0057F, -0.0433F));

		ModelPartData cube_r64 = leftwings.addChild("cube_r64", ModelPartBuilder.create().uv(30, 16).cuboid(1.0F, -7.3032F, 0.8888F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(37, 62).cuboid(1.0F, -7.3032F, 2.8888F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.2113F, 4.0436F, -5.3288F, 0.4362F, 0.0057F, -0.0433F));

		ModelPartData cube_r65 = leftwings.addChild("cube_r65", ModelPartBuilder.create().uv(24, 63).cuboid(-0.2961F, -1.4294F, 2.0392F, 0.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.2113F, -2.9564F, -4.3288F, -0.4801F, 0.0057F, -0.0433F));

		ModelPartData cube_r66 = leftwings.addChild("cube_r66", ModelPartBuilder.create().uv(19, 62).cuboid(1.0F, -7.3032F, 2.8888F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(21, 62).cuboid(1.0F, -7.3032F, 3.8888F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.2113F, 4.0436F, -5.3288F, 0.3926F, 0.0057F, -0.0433F));

		ModelPartData cube_r67 = leftwings.addChild("cube_r67", ModelPartBuilder.create().uv(29, 62).cuboid(1.0F, -7.3032F, -5.1112F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(8, 32).cuboid(1.0F, -7.3032F, -8.1112F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(8, 32).cuboid(1.0F, -8.3032F, -8.1112F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(8, 32).cuboid(1.0F, -9.3032F, -8.1112F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(32, 61).cuboid(1.0F, -8.3032F, -6.1112F, 0.0F, 1.0F, 2.0F, new Dilation(0.0F))
				.uv(30, 15).cuboid(1.0F, -8.3032F, -3.1112F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(31, 62).cuboid(1.0F, -8.3032F, -4.1112F, 0.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(27, 62).cuboid(1.0F, -7.3032F, -6.1112F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(25, 62).cuboid(1.0F, -7.3032F, -7.1112F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(12, 20).cuboid(1.0F, -5.3032F, -4.1112F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(24, 55).cuboid(1.0F, -5.3032F, -3.1112F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(34, 55).cuboid(1.0F, -5.3032F, -2.1112F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(7, 62).cuboid(1.0F, -6.3032F, 1.8888F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(17, 62).cuboid(1.0F, -6.3032F, 0.8888F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(25, 54).cuboid(1.0F, -5.3032F, -0.1112F, 0.0F, 3.0F, 2.0F, new Dilation(0.0F))
				.uv(30, 5).cuboid(1.0F, -7.3032F, -0.1112F, 0.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(36, 55).cuboid(1.0F, -6.3032F, -1.1112F, 0.0F, 4.0F, 1.0F, new Dilation(0.0F))
				.uv(48, 5).cuboid(1.0F, 0.6968F, -3.1112F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(30, 55).cuboid(1.0F, -2.3032F, -3.1112F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(28, 55).cuboid(1.0F, 0.6968F, -2.1112F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(32, 55).cuboid(1.0F, -2.3032F, -2.1112F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(22, 55).cuboid(1.0F, -2.3032F, -0.1112F, 0.0F, 2.0F, 1.0F, new Dilation(0.0F))
				.uv(38, 55).cuboid(1.0F, -2.3032F, -1.1112F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(43, 19).cuboid(1.0F, 1.6968F, -1.1112F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(40, 55).cuboid(1.0F, 0.6968F, -1.1112F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(53, 0).cuboid(1.0F, 0.6968F, -0.1112F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(53, 32).cuboid(0.0F, 0.6968F, -0.1112F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.2113F, 4.0436F, -5.3288F, -0.3928F, 0.0057F, -0.0433F));

		ModelPartData cube_r68 = leftwings.addChild("cube_r68", ModelPartBuilder.create().uv(27, 12).cuboid(0.5129F, 1.0849F, -1.0593F, 0.0F, 1.0F, 2.0F, new Dilation(0.0F))
				.uv(6, 28).cuboid(0.5129F, -0.9151F, -1.0593F, 0.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-2.2113F, -6.9564F, -7.3288F, -0.4801F, 0.0057F, -0.0433F));

		ModelPartData cube_r69 = leftwings.addChild("cube_r69", ModelPartBuilder.create().uv(15, 10).cuboid(-0.3883F, -0.0334F, -1.6931F, 0.0F, 1.0F, 3.0F, new Dilation(0.0F))
				.uv(18, 4).cuboid(-0.3883F, -1.0334F, -1.6931F, 0.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.2113F, -4.9564F, -5.3288F, -0.9164F, 0.0057F, -0.0433F));

		ModelPartData cube_r70 = leftwings.addChild("cube_r70", ModelPartBuilder.create().uv(8, 33).cuboid(0.6256F, -2.8326F, -2.4344F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.2113F, -3.9564F, -10.3288F, -0.9601F, 0.0057F, -0.0433F));

		ModelPartData cube_r71 = leftwings.addChild("cube_r71", ModelPartBuilder.create().uv(7, 20).cuboid(0.6256F, -2.8326F, -0.4344F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.2113F, -3.9564F, -10.3288F, -0.6983F, 0.0057F, -0.0433F));

		ModelPartData cube_r72 = leftwings.addChild("cube_r72", ModelPartBuilder.create().uv(47, 62).cuboid(0.6313F, -1.4498F, -0.3583F, 0.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.2113F, -3.9564F, -9.3288F, -0.611F, 0.0057F, -0.0433F));

		ModelPartData cube_r73 = leftwings.addChild("cube_r73", ModelPartBuilder.create().uv(0, 30).cuboid(-0.1925F, -1.1945F, -0.9172F, 0.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.2113F, -0.9564F, -1.3288F, -0.0001F, 0.0057F, -0.0433F));

		ModelPartData cube_r74 = leftwings.addChild("cube_r74", ModelPartBuilder.create().uv(18, 55).cuboid(0.9397F, -2.5285F, -0.9576F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(20, 55).cuboid(0.9397F, -2.5285F, -1.9576F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.2113F, 3.0436F, -8.3288F, -0.6983F, 0.0057F, -0.0433F));

		ModelPartData cube_r75 = leftwings.addChild("cube_r75", ModelPartBuilder.create().uv(41, 4).cuboid(0.9772F, -1.8343F, 0.5841F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F))
				.uv(42, 35).cuboid(0.9772F, -1.8343F, -0.4159F, 0.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.2113F, 4.0436F, -9.3288F, 0.1308F, 0.0057F, -0.0433F));

		ModelPartData cube_r76 = leftwings.addChild("cube_r76", ModelPartBuilder.create().uv(28, 13).cuboid(1.0751F, 1.0851F, -1.028F, 0.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.2113F, 6.0436F, -7.3288F, -0.4801F, 0.0057F, -0.0433F));

		ModelPartData cube_r77 = leftwings.addChild("cube_r77", ModelPartBuilder.create().uv(27, 12).cuboid(-0.9867F, -1.6131F, -1.0025F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.2113F, 4.0436F, -3.3288F, 0.0013F, 0.0282F, 0.0411F));

		ModelPartData cube_r78 = leftwings.addChild("cube_r78", ModelPartBuilder.create().uv(55, 45).cuboid(1.0F, -0.3032F, -0.1112F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
				.uv(9, 60).cuboid(0.0F, -0.3032F, -0.1112F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-2.2113F, 4.0436F, -5.3288F, -0.1747F, 0.0057F, -0.0433F));

		ModelPartData rightleg = allbody.addChild("rightleg", ModelPartBuilder.create().uv(8, 33).cuboid(-1.0F, 1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
				.uv(44, 47).cuboid(1.0F, 6.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 9.0F, 1.0F));

		ModelPartData cube_r79 = rightleg.addChild("cube_r79", ModelPartBuilder.create().uv(29, 39).cuboid(0.0F, -10.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.0F, 0.0F, -0.0038F, 0.0435F, -0.1746F));

		ModelPartData cube_r80 = rightleg.addChild("cube_r80", ModelPartBuilder.create().uv(40, 24).cuboid(-1.5628F, 0.8633F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		ModelPartData skirt = allbody.addChild("skirt", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 8.0F, 0.0F));

		ModelPartData cube_r81 = skirt.addChild("cube_r81", ModelPartBuilder.create().uv(1, 1).cuboid(-2.0F, -2.6319F, 4.2412F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(1, 1).cuboid(-2.0F, -2.6319F, 2.2412F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, 1.0F, -3.0F, -0.0439F, 0.0808F, -0.0547F));

		ModelPartData cube_r82 = skirt.addChild("cube_r82", ModelPartBuilder.create().uv(1, 1).cuboid(-2.0F, -2.6319F, 3.2412F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, 1.0F, -3.0F, -0.0441F, 0.1244F, -0.0566F));

		ModelPartData cube_r83 = skirt.addChild("cube_r83", ModelPartBuilder.create().uv(1, 1).cuboid(-2.0F, -2.6319F, 1.2412F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(1, 1).cuboid(-2.0F, -2.6319F, -0.7588F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, 1.0F, -3.0F, -0.1309F, 0.0F, 0.0F));

		ModelPartData cube_r84 = skirt.addChild("cube_r84", ModelPartBuilder.create().uv(1, 1).cuboid(-2.0F, -2.6319F, 0.2412F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, 1.0F, -3.0F, -0.1216F, -0.0653F, -0.1677F));

		ModelPartData cube_r85 = skirt.addChild("cube_r85", ModelPartBuilder.create().uv(1, 1).cuboid(0.0F, -4.0F, 2.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(1, 1).cuboid(-2.0F, -4.0F, 2.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(1, 1).cuboid(-4.0F, -4.0F, 2.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, -7.0F, -0.3491F, 0.0F, 0.0F));

		ModelPartData cube_r86 = skirt.addChild("cube_r86", ModelPartBuilder.create().uv(1, 1).cuboid(-3.0F, -4.0F, 1.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, -7.0F, -0.3478F, 0.0298F, 0.082F));

		ModelPartData cube_r87 = skirt.addChild("cube_r87", ModelPartBuilder.create().uv(1, 1).cuboid(-0.7573F, -2.3809F, -0.2268F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 1.0F, 3.0F, 3.0502F, 0.3527F, 3.073F));

		ModelPartData cube_r88 = skirt.addChild("cube_r88", ModelPartBuilder.create().uv(1, 1).cuboid(-2.1452F, -2.1111F, 3.6723F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(1, 1).cuboid(-2.1452F, -2.1111F, 1.6723F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(1, 1).cuboid(-2.1452F, -2.1111F, 0.6723F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(1, 1).cuboid(-1.1452F, -2.1111F, -0.3277F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(1, 1).cuboid(-0.1452F, -2.1111F, -0.3277F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 1.0F, 2.0F, 2.3338F, 1.452F, 2.3004F));

		ModelPartData cube_r89 = skirt.addChild("cube_r89", ModelPartBuilder.create().uv(1, 1).cuboid(-2.1452F, -2.1111F, 2.6723F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 1.0F, 2.0F, 1.9355F, 1.3391F, 1.8967F));

		ModelPartData cube_r90 = skirt.addChild("cube_r90", ModelPartBuilder.create().uv(1, 1).cuboid(-3.1278F, -2.2899F, -0.6553F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(1, 1).cuboid(-2.1278F, -2.2899F, -0.6553F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(1, 1).cuboid(-1.1278F, -2.2899F, -0.6553F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 1.0F, -2.0F, -2.642F, 1.4774F, -2.6701F));

		ModelPartData cube_r91 = skirt.addChild("cube_r91", ModelPartBuilder.create().uv(1, 1).cuboid(-0.1278F, -2.2899F, -0.6553F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 1.0F, -2.0F, -2.0101F, 1.377F, -2.0328F));

		ModelPartData cube_r92 = skirt.addChild("cube_r92", ModelPartBuilder.create().uv(1, 1).cuboid(-1.0F, -2.9739F, -0.8191F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F))
				.uv(1, 1).cuboid(0.0F, -2.9739F, -0.8191F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, 1.0F, -4.0F, -1.8058F, 1.2114F, -1.8212F));

		ModelPartData cube_r93 = skirt.addChild("cube_r93", ModelPartBuilder.create().uv(1, 1).cuboid(-1.0F, -4.0F, 2.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, -7.0F, -0.48F, 0.0F, 0.0F));

		ModelPartData leftleg = allbody.addChild("leftleg", ModelPartBuilder.create().uv(0, 31).cuboid(-1.0F, 1.0F, -1.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F))
				.uv(47, 3).cuboid(1.0F, 6.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 9.0F, -2.0F));

		ModelPartData cube_r94 = leftleg.addChild("cube_r94", ModelPartBuilder.create().uv(21, 39).cuboid(-1.6925F, -1.1481F, -1.0371F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, 0.0F, -0.0038F, 0.0435F, -0.1746F));

		ModelPartData cube_r95 = leftleg.addChild("cube_r95", ModelPartBuilder.create().uv(0, 40).cuboid(0.0F, -8.0F, -4.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 7.0F, 3.0F, 0.0F, 0.0F, -0.1745F));

		ModelPartData leftarm = allbody.addChild("leftarm", ModelPartBuilder.create().uv(30, 6).cuboid(-2.4451F, -2.9662F, -1.1F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F))
				.uv(43, 28).cuboid(1.5549F, 4.0338F, -1.1F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.5549F, 0.9662F, -4.9F));

		ModelPartData cube_r96 = leftarm.addChild("cube_r96", ModelPartBuilder.create().uv(16, 33).cuboid(0.5557F, -1.9636F, -10.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.4451F, 4.0338F, 8.9F, 0.0F, 0.0F, -0.6109F));

		ModelPartData cube_r97 = leftarm.addChild("cube_r97", ModelPartBuilder.create().uv(20, 13).cuboid(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(2.5549F, 5.0338F, -1.1F, 0.0F, 0.0F, 0.9163F));

		ModelPartData cube_r98 = leftarm.addChild("cube_r98", ModelPartBuilder.create().uv(32, 33).cuboid(0.0F, -17.0F, -7.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.5549F, 15.0338F, 5.9F, 0.0F, 0.0F, -0.1309F));

		ModelPartData rightarm = allbody.addChild("rightarm", ModelPartBuilder.create().uv(30, 10).cuboid(-2.0F, -3.0F, -2.0F, 3.0F, 1.0F, 3.0F, new Dilation(0.0F))
				.uv(44, 0).cuboid(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, 1.0F, 4.0F));

		ModelPartData cube_r99 = rightarm.addChild("cube_r99", ModelPartBuilder.create().uv(24, 6).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, 5.0F, 0.0F, 0.0426F, -0.0094F, 0.8288F));

		ModelPartData cube_r100 = rightarm.addChild("cube_r100", ModelPartBuilder.create().uv(24, 33).cuboid(0.5557F, -1.9636F, -1.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 4.0F, 0.0F, 0.0F, 0.0F, -0.6109F));

		ModelPartData cube_r101 = rightarm.addChild("cube_r101", ModelPartBuilder.create().uv(35, 18).cuboid(0.0F, -17.0F, 2.0F, 2.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 15.0F, -3.0F, 0.0F, 0.0F, -0.1309F));

		ModelPartData waist = allbody.addChild("waist", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -1.0F, -4.0F, 5.0F, 2.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 6.0F, 0.0F));
		return TexturedModelData.of(modelData, 128, 128);

	}

	@Override
	public void setAngles(FaerieEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);


		this.updateAnimation(entity.idleAnimationState, ModAnimations.FAERIE_IDLE, ageInTicks, 1f);
		this.updateAnimation(entity.attackAnimationState, ModAnimations.FAERIE_ATTACK, ageInTicks, 1f);
		this.animateMovement(ModAnimations.FAERIE_WALKING_ANIMATION, limbSwing, limbSwingAmount, 2f, 2.5f);


	}

	private void setHeadAngles(float headYaw, float headPitch ){
		headYaw = MathHelper.clamp(headYaw,-30.0f, 30.0f);
		headPitch = MathHelper.clamp(headPitch, -25.0f, 45.0f);
		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;

	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Faerie.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {

		return Faerie;
	}
}