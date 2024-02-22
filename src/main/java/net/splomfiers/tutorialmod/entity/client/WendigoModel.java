package net.splomfiers.tutorialmod.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.splomfiers.tutorialmod.entity.animation.ModAnimations;
import net.splomfiers.tutorialmod.entity.custom.WendigoEntity;

public class WendigoModel <T extends WendigoEntity> extends SinglePartEntityModel<T> {
	private final ModelPart wendigo;
	private final ModelPart skull;

    public WendigoModel(ModelPart root) {
		this.wendigo = root.getChild("wendigo");
		this.skull = wendigo.getChild("head").getChild("skull");


    }
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData wendigo = modelPartData.addChild("wendigo", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -4.0F, 0.0F));

		ModelPartData head = wendigo.addChild("head", ModelPartBuilder.create().uv(136, 45).cuboid(2.0F, -1.0F, -7.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(128, 122).cuboid(2.0F, 1.0F, -7.0F, 2.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(128, 49).cuboid(2.0F, 2.0F, -5.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(116, 94).cuboid(2.0F, 1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(116, 100).cuboid(2.0F, 0.0F, -3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(28, 128).cuboid(2.0F, 2.0F, -1.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(116, 70).cuboid(2.0F, -6.0F, -1.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(124, 66).cuboid(2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(125, 67).cuboid(2.0F, -2.0F, 0.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(3, 127).cuboid(2.0F, -2.0F, 3.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(76, 123).cuboid(2.0F, -4.0F, 0.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(40, 123).cuboid(2.0F, -6.0F, 0.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(125, 39).cuboid(2.0F, -8.0F, 2.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(19, 131).cuboid(3.0F, 2.0F, 3.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(68, 127).cuboid(1.0F, 2.0F, 0.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(56, 127).cuboid(-1.0F, 2.0F, 0.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(88, 88).cuboid(-1.0F, 4.0F, 0.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(120, 126).cuboid(-3.0F, 2.0F, 0.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(91, 45).cuboid(-3.0F, 4.0F, 0.0F, 2.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(89, 76).cuboid(-3.0F, 5.0F, 0.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(123, 30).cuboid(-3.0F, 0.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(120, 114).cuboid(0.0F, -2.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(120, 114).cuboid(0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(96, 120).cuboid(0.0F, -4.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(120, 53).cuboid(1.0F, -6.0F, 2.0F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(87, 10).cuboid(0.0F, -6.0F, -6.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(120, 47).cuboid(0.0F, -4.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(120, 120).cuboid(-1.0F, 0.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(8, 120).cuboid(-1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(48, 119).cuboid(-1.0F, -4.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(115, 35).cuboid(-1.0F, -4.0F, 3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(115, 8).cuboid(-1.0F, -2.0F, 3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(115, 22).cuboid(-3.0F, -4.0F, 3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(96, 114).cuboid(-3.0F, -2.0F, 3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(8, 114).cuboid(-5.0F, -2.0F, 3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(115, 15).cuboid(-5.0F, -4.0F, 3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(116, 106).cuboid(-1.0F, -6.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(104, 122).cuboid(-5.0F, 0.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(112, 118).cuboid(-7.0F, 0.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(89, 119).cuboid(-7.0F, -1.0F, 3.0F, 2.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 118).cuboid(-7.0F, -3.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(76, 117).cuboid(-7.0F, -5.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(40, 117).cuboid(-7.0F, -7.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(28, 122).cuboid(-5.0F, -2.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(16, 122).cuboid(-5.0F, -4.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(68, 121).cuboid(-5.0F, -6.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(84, 58).cuboid(-6.0F, -6.0F, -7.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(124, 63).cuboid(-5.0F, -8.0F, 5.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(50, 109).cuboid(-5.0F, -8.0F, 3.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(109, 47).cuboid(-4.0F, -8.0F, 1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(102, 80).cuboid(-6.0F, -8.0F, 1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(107, 39).cuboid(-6.0F, -8.0F, -3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(28, 98).cuboid(-8.0F, -8.0F, -3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(100, 102).cuboid(-4.0F, -8.0F, -3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(104, 8).cuboid(-1.0F, -8.0F, 3.0F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(48, 101).cuboid(-2.0F, -8.0F, -1.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(107, 20).cuboid(-8.0F, -8.0F, -5.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(107, 20).cuboid(-8.0F, -8.0F, -7.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(100, 96).cuboid(-8.0F, -8.0F, -5.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(16, 98).cuboid(-8.0F, -8.0F, -5.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(103, 0).cuboid(-4.0F, -8.0F, -5.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(56, 103).cuboid(-2.0F, -8.0F, -5.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(97, 72).cuboid(-6.0F, -8.0F, -7.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(107, 70).cuboid(-4.0F, -8.0F, -7.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(104, 62).cuboid(0.0F, -8.0F, -7.0F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(99, 41).cuboid(1.0F, -8.0F, -7.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(105, 57).cuboid(0.0F, -8.0F, -4.0F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 100).cuboid(2.0F, -8.0F, -5.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(80, 99).cuboid(2.0F, -8.0F, -2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(28, 104).cuboid(-4.0F, -8.0F, -3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(99, 47).cuboid(2.0F, -7.0F, -3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(17, 105).cuboid(0.0F, -8.0F, -1.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(68, 103).cuboid(0.0F, -8.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(91, 109).cuboid(-5.0F, -8.0F, -8.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(123, 24).cuboid(-3.0F, -2.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(123, 18).cuboid(-3.0F, -4.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(123, 12).cuboid(-3.0F, -6.0F, 2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(126, 9).cuboid(-3.0F, -8.0F, 5.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(104, 29).cuboid(-3.0F, -8.0F, 3.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(130, 118).cuboid(3.0F, 2.0F, -7.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(104, 128).cuboid(1.0F, 2.0F, -7.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(110, 82).cuboid(0.0F, 4.0F, -8.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(110, 82).cuboid(1.0F, 5.0F, -8.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(54, 97).cuboid(0.0F, 4.0F, -6.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(97, 37).cuboid(0.0F, 4.0F, -4.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(94, 54).cuboid(0.0F, 4.0F, -2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(96, 66).cuboid(1.0F, 6.0F, -8.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(96, 60).cuboid(-1.0F, 6.0F, -8.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(74, 93).cuboid(-1.0F, 6.0F, -4.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(60, 91).cuboid(-1.0F, 6.0F, -2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(8, 96).cuboid(-3.0F, 7.0F, -8.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(88, 64).cuboid(-3.0F, 6.0F, -6.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(2, 96).cuboid(-3.0F, 7.0F, -4.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(80, 93).cuboid(-3.0F, 7.0F, -2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(108, 74).cuboid(1.0F, 3.0F, -8.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 136).cuboid(2.0F, -1.0F, -6.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(130, 136).cuboid(-8.0F, -1.0F, -5.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(132, 74).cuboid(-8.0F, -3.0F, -6.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(131, 26).cuboid(-8.0F, -5.0F, -4.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(106, 136).cuboid(-8.0F, -1.0F, -7.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(129, 55).cuboid(-8.0F, 1.0F, -7.0F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(96, 126).cuboid(-8.0F, 2.0F, -5.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(124, 72).cuboid(-8.0F, 1.0F, -4.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(8, 126).cuboid(-8.0F, 2.0F, -4.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(50, 127).cuboid(-8.0F, 2.0F, 0.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(112, 58).cuboid(-8.0F, -7.0F, -2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(114, 126).cuboid(-8.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(124, 96).cuboid(-8.0F, 0.0F, 0.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(124, 90).cuboid(-8.0F, -2.0F, 0.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(88, 124).cuboid(-8.0F, -4.0F, 0.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(124, 84).cuboid(-8.0F, -6.0F, 0.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(124, 78).cuboid(-8.0F, -8.0F, 0.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(124, 108).cuboid(-4.0F, 2.0F, 0.0F, 1.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(52, 89).cuboid(-5.0F, 4.0F, 0.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(124, 102).cuboid(-6.0F, 2.0F, 0.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(128, 128).cuboid(-7.0F, 2.0F, -7.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(128, 128).cuboid(-7.0F, 1.0F, -7.0F, 2.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(96, 108).cuboid(-7.0F, 3.0F, -8.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(110, 94).cuboid(-5.0F, 4.0F, -8.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(95, 12).cuboid(-6.0F, 4.0F, -6.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(92, 94).cuboid(-6.0F, 4.0F, -2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(74, 99).cuboid(-6.0F, 5.0F, -8.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(62, 99).cuboid(-5.0F, 7.0F, -8.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(60, 97).cuboid(-4.0F, 6.0F, -8.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(44, 93).cuboid(-5.0F, 6.0F, -6.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(32, 92).cuboid(-5.0F, 6.0F, -2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(31, 137).cuboid(-8.0F, -3.0F, -7.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(16, 134).cuboid(-8.0F, -5.0F, -7.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(16, 134).cuboid(-8.0F, -7.0F, -7.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(138, 40).cuboid(2.0F, -3.0F, -7.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(120, 132).cuboid(0.0F, -1.0F, -3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(132, 110).cuboid(-6.0F, -1.0F, -3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(131, 32).cuboid(-8.0F, -5.0F, -3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(104, 110).cuboid(-9.0F, -7.0F, -2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(111, 29).cuboid(-9.0F, -5.0F, -2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(41, 112).cuboid(-9.0F, -5.0F, -5.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(17, 111).cuboid(-9.0F, -7.0F, -5.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(111, 2).cuboid(-9.0F, -3.0F, -2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(77, 112).cuboid(-9.0F, -3.0F, -5.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(77, 112).cuboid(-9.0F, -1.0F, -5.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F))
		.uv(108, 98).cuboid(-9.0F, 1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(108, 104).cuboid(-9.0F, -1.0F, -2.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(131, 8).cuboid(-8.0F, -6.0F, -3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(96, 132).cuboid(-6.0F, -2.0F, -3.0F, 2.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(48, 131).cuboid(-6.0F, -4.0F, -3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(132, 92).cuboid(0.0F, -2.0F, -3.0F, 2.0F, 1.0F, 4.0F, new Dilation(0.0F))
		.uv(8, 132).cuboid(0.0F, -4.0F, -3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(132, 80).cuboid(2.0F, -3.0F, -5.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(114, 132).cuboid(3.0F, -3.0F, -5.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(78, 131).cuboid(4.0F, -1.0F, -5.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(8, 108).cuboid(3.0F, 1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(115, 41).cuboid(3.0F, -1.0F, -3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(88, 130).cuboid(3.0F, -5.0F, -5.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(90, 132).cuboid(3.0F, -5.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(90, 132).cuboid(3.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(88, 130).cuboid(3.0F, -3.0F, -3.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 130).cuboid(3.0F, -7.0F, -5.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(76, 135).cuboid(2.0F, -5.0F, -7.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(40, 135).cuboid(2.0F, -7.0F, -7.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(131, 14).cuboid(2.0F, -7.0F, -5.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(80, 52).cuboid(2.0F, -10.0F, -3.0F, 5.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(80, 52).cuboid(5.0F, -12.0F, -3.0F, 5.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(68, 22).cuboid(1.0F, -16.0F, -3.0F, 6.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 85).cuboid(1.0F, -21.0F, -3.0F, 2.0F, 5.0F, 4.0F, new Dilation(0.0F))
		.uv(0, 85).cuboid(7.0F, -19.0F, -3.0F, 2.0F, 7.0F, 4.0F, new Dilation(0.0F))
		.uv(12, 88).cuboid(2.0F, -25.0F, -3.0F, 2.0F, 4.0F, 4.0F, new Dilation(0.0F))
		.uv(72, 28).cuboid(-14.0F, -12.0F, -3.0F, 5.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(74, 67).cuboid(-11.0F, -10.0F, -3.0F, 5.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -33.0F, 9.0F));

		ModelPartData bone3 = head.addChild("bone3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 33.0F, -9.0F));

		ModelPartData cube_r1 = bone3.addChild("cube_r1", ModelPartBuilder.create().uv(66, 46).cuboid(17.0F, 48.0F, -25.0F, 2.0F, 2.0F, 7.0F, new Dilation(0.0F))
		.uv(20, 83).cuboid(17.0F, 43.0F, -20.0F, 2.0F, 5.0F, 4.0F, new Dilation(0.0F))
		.uv(20, 83).cuboid(17.0F, 48.0F, -20.0F, 2.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.2856F, -0.6248F, -2.5552F));

		ModelPartData cube_r2 = bone3.addChild("cube_r2", ModelPartBuilder.create().uv(20, 83).cuboid(-2.1531F, -0.8022F, -0.7326F, 2.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, -53.0F, 7.0F, 0.4746F, -0.2208F, -2.8177F));

		ModelPartData cube_r3 = bone3.addChild("cube_r3", ModelPartBuilder.create().uv(87, 16).cuboid(10.0F, -39.0F, 27.0F, 2.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		ModelPartData bone4 = head.addChild("bone4", ModelPartBuilder.create(), ModelTransform.pivot(-24.0F, 33.0F, -9.0F));

		ModelPartData cube_r4 = bone4.addChild("cube_r4", ModelPartBuilder.create().uv(40, 12).cuboid(40.0F, -21.0F, -33.0F, 2.0F, 7.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-29.0F, -18.0F, -11.0F, -0.3364F, -0.9183F, -0.1565F));

		ModelPartData cube_r5 = bone4.addChild("cube_r5", ModelPartBuilder.create().uv(44, 84).cuboid(-17.0F, -43.0F, 29.0F, 2.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.4295F, -0.3093F, 0.5865F));

		ModelPartData cube_r6 = bone4.addChild("cube_r6", ModelPartBuilder.create().uv(77, 42).cuboid(-1.5F, -3.0F, -2.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-1.5F, -53.4711F, 2.6147F, 0.48F, 0.0F, -0.48F));

		ModelPartData cube_r7 = bone4.addChild("cube_r7", ModelPartBuilder.create().uv(77, 42).cuboid(0.0F, -43.0F, 27.0F, 3.0F, 6.0F, 4.0F, new Dilation(0.0F))
		.uv(52, 34).cuboid(0.0F, -37.0F, 27.0F, 10.0F, 2.0F, 4.0F, new Dilation(0.0F))
		.uv(86, 30).cuboid(10.0F, -39.0F, 27.0F, 2.0F, 5.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		ModelPartData skull = head.addChild("skull", ModelPartBuilder.create().uv(41, 159).cuboid(-7.0F, -25.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(145, 52).cuboid(-7.0F, -25.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(132, 158).cuboid(-3.0F, -28.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(159, 21).cuboid(-3.0F, -29.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(10, 156).cuboid(-4.0F, -26.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(161, 11).cuboid(0.0F, -28.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(125, 159).cuboid(-4.0F, -28.0F, 0.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(156, 160).cuboid(-2.0F, -28.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(127, 144).cuboid(-6.0F, -27.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(111, 158).cuboid(-5.0F, -29.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(150, 136).cuboid(-5.0F, -28.0F, -3.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(149, 131).cuboid(-4.0F, -28.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(65, 149).cuboid(-3.0F, -28.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(149, 64).cuboid(-2.0F, -28.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(150, 61).cuboid(-1.0F, -28.0F, -3.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(151, 44).cuboid(0.0F, -28.0F, -3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(150, 80).cuboid(-2.0F, -28.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(150, 76).cuboid(-1.0F, -28.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(150, 72).cuboid(0.0F, -29.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(156, 48).cuboid(-1.0F, -25.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(156, 117).cuboid(-4.0F, -27.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(155, 149).cuboid(-4.0F, -25.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(26, 156).cuboid(0.0F, -24.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(144, 21).cuboid(0.0F, -24.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(154, 28).cuboid(2.0F, -24.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(150, 92).cuboid(2.0F, -24.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(26, 144).cuboid(2.0F, -24.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(18, 144).cuboid(1.0F, -24.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(145, 69).cuboid(2.0F, -26.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(156, 44).cuboid(-1.0F, -26.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(154, 62).cuboid(-1.0F, -24.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(144, 27).cuboid(-1.0F, -24.0F, -4.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(154, 58).cuboid(-1.0F, -25.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(144, 33).cuboid(-1.0F, -25.0F, -4.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(154, 40).cuboid(-1.0F, -26.0F, -4.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(154, 32).cuboid(1.0F, -27.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(90, 156).cuboid(-4.0F, -24.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(155, 70).cuboid(-4.0F, -24.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(161, 27).cuboid(-2.0F, -29.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(70, 150).cuboid(-2.0F, -29.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(2, 152).cuboid(-3.0F, -29.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(149, 139).cuboid(-4.0F, -29.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(152, 70).cuboid(-1.0F, -29.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(60, 155).cuboid(-4.0F, -26.0F, -4.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(156, 83).cuboid(1.0F, -20.0F, 2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(156, 67).cuboid(-4.0F, -25.0F, -4.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(80, 156).cuboid(-5.0F, -24.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(128, 150).cuboid(-5.0F, -27.0F, -4.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(150, 104).cuboid(1.0F, -27.0F, -4.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(150, 100).cuboid(2.0F, -26.0F, -4.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(140, 146).cuboid(2.0F, -25.0F, -4.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(150, 96).cuboid(2.0F, -24.0F, -4.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(116, 150).cuboid(-6.0F, -27.0F, -4.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(146, 138).cuboid(-6.0F, -27.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(155, 141).cuboid(-7.0F, -24.0F, -2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(151, 54).cuboid(-7.0F, -26.0F, -4.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(132, 146).cuboid(-7.0F, -25.0F, -4.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(53, 152).cuboid(-7.0F, -24.0F, -4.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(65, 157).cuboid(-7.0F, -26.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(39, 145).cuboid(-7.0F, -26.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(5, 155).cuboid(-7.0F, -26.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(151, 46).cuboid(-7.0F, -26.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(68, 145).cuboid(-6.0F, -24.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(155, 98).cuboid(-6.0F, -23.0F, 1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(154, 132).cuboid(-5.0F, -21.0F, 1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(155, 94).cuboid(-6.0F, -22.0F, 1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(134, 154).cuboid(-5.0F, -22.0F, 1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(155, 90).cuboid(-6.0F, -21.0F, 1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(156, 129).cuboid(-5.0F, -20.0F, 3.0F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(126, 154).cuboid(-5.0F, -23.0F, 1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(154, 20).cuboid(-4.0F, -23.0F, 2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(78, 147).cuboid(-4.0F, -23.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(106, 145).cuboid(-4.0F, -23.0F, -3.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(60, 147).cuboid(-4.0F, -22.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(98, 145).cuboid(-4.0F, -22.0F, -3.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(54, 149).cuboid(-4.0F, -21.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(118, 146).cuboid(-4.0F, -21.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(87, 146).cuboid(-4.0F, -21.0F, -3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(152, 113).cuboid(-3.0F, -23.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(101, 152).cuboid(-3.0F, -24.0F, 3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(93, 152).cuboid(-3.0F, -25.0F, 3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(152, 4).cuboid(-4.0F, -25.0F, 3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(151, 123).cuboid(-4.0F, -24.0F, 3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(141, 151).cuboid(-4.0F, -26.0F, 3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(80, 152).cuboid(-3.0F, -26.0F, 3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(86, 25).cuboid(-3.0F, -26.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(30, 68).cuboid(-2.0F, -25.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(51, 62).cuboid(-2.0F, -24.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(15, 32).cuboid(-2.0F, -23.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(28, 83).cuboid(-3.0F, -25.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(38, 76).cuboid(-3.0F, -24.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(74, 55).cuboid(-3.0F, -23.0F, 3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(52, 84).cuboid(-2.0F, -26.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(34, 152).cuboid(-2.0F, -26.0F, 3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(26, 152).cuboid(-2.0F, -25.0F, 3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(18, 152).cuboid(-2.0F, -24.0F, 3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(151, 119).cuboid(-1.0F, -24.0F, 3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(75, 151).cuboid(-1.0F, -25.0F, 3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(60, 151).cuboid(-1.0F, -26.0F, 3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(10, 152).cuboid(-2.0F, -23.0F, 3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(154, 16).cuboid(-4.0F, -22.0F, 2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(154, 12).cuboid(-4.0F, -21.0F, 2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(1, 155).cuboid(-1.0F, -21.0F, 3.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(153, 108).cuboid(-1.0F, -23.0F, 2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(119, 156).cuboid(-5.0F, -24.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(151, 50).cuboid(-6.0F, -24.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(155, 86).cuboid(-6.0F, -20.0F, 1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(85, 158).cuboid(-4.0F, -27.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(107, 155).cuboid(0.0F, -22.0F, 2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(77, 157).cuboid(1.0F, -22.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(105, 160).cuboid(-5.0F, -27.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(114, 154).cuboid(0.0F, -23.0F, 1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(155, 74).cuboid(1.0F, -23.0F, 1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(39, 149).cuboid(1.0F, -23.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(24, 128).cuboid(1.0F, -23.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(149, 38).cuboid(1.0F, -22.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(129, 2).cuboid(1.0F, -22.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(64, 121).cuboid(1.0F, -21.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(24, 116).cuboid(1.0F, -20.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(150, 1).cuboid(0.0F, -20.0F, 2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(64, 115).cuboid(0.0F, -20.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(124, 149).cuboid(0.0F, -21.0F, 2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(24, 122).cuboid(0.0F, -21.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(44, 147).cuboid(-1.0F, -21.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(144, 37).cuboid(-1.0F, -21.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(147, 5).cuboid(-1.0F, -22.0F, 2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(144, 44).cuboid(-1.0F, -22.0F, -3.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(5, 147).cuboid(-1.0F, -23.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(73, 146).cuboid(-1.0F, -23.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(146, 65).cuboid(-1.0F, -23.0F, -3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(149, 110).cuboid(-1.0F, -22.0F, 0.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(64, 127).cuboid(0.0F, -22.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(103, 148).cuboid(0.0F, -23.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(64, 133).cuboid(0.0F, -23.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(149, 26).cuboid(1.0F, -19.0F, 1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(64, 109).cuboid(1.0F, -19.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(24, 110).cuboid(0.0F, -19.0F, 1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(18, 156).cuboid(-6.0F, -25.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(145, 99).cuboid(2.0F, -26.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(70, 158).cuboid(-3.0F, -27.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(149, 157).cuboid(0.0F, -27.0F, -4.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 158).cuboid(-1.0F, -27.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(156, 154).cuboid(2.0F, -25.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(147, 95).cuboid(2.0F, -25.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(145, 75).cuboid(1.0F, -27.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(145, 81).cuboid(1.0F, -27.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(158, 5).cuboid(-2.0F, -27.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(145, 87).cuboid(2.0F, -24.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(156, 121).cuboid(1.0F, -24.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(157, 80).cuboid(1.0F, -21.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(155, 102).cuboid(1.0F, -25.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(5, 159).cuboid(-1.0F, -29.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(161, 19).cuboid(-4.0F, -29.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(87, 156).cuboid(1.0F, -21.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(67, 155).cuboid(-1.0F, -19.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(154, 9).cuboid(-6.0F, -19.0F, 2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(68, 91).cuboid(-6.0F, -19.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(35, 149).cuboid(-6.0F, -20.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(25, 99).cuboid(-6.0F, -21.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(65, 104).cuboid(-6.0F, -22.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(150, 11).cuboid(-5.0F, -22.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(24, 104).cuboid(-5.0F, -22.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(147, 143).cuboid(-5.0F, -21.0F, 0.0F, 0.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(36, 98).cuboid(-5.0F, -21.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(147, 115).cuboid(-5.0F, -20.0F, 2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(68, 97).cuboid(-5.0F, -20.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(145, 147).cuboid(-4.0F, -24.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(108, 51).cuboid(-5.0F, -23.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(85, 106).cuboid(-6.0F, -23.0F, -1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(94, 0).cuboid(-4.0F, -19.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(153, 145).cuboid(-4.0F, -18.0F, 1.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(121, 152).cuboid(0.0F, -19.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(149, 17).cuboid(-1.0F, -19.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(138, 118).cuboid(-1.0F, -19.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(149, 13).cuboid(-5.0F, -19.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(138, 136).cuboid(-4.0F, -19.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(136, 128).cuboid(-4.0F, -18.0F, -2.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(146, 17).cuboid(-4.0F, -19.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(55, 143).cuboid(-5.0F, -19.0F, 1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(10, 144).cuboid(-4.0F, -17.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(0, 146).cuboid(-4.0F, -17.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(138, 124).cuboid(-4.0F, -17.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(25, 135).cuboid(-1.0F, -17.0F, -2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(63, 143).cuboid(-1.0F, -17.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(89, 137).cuboid(-1.0F, -18.0F, -2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(144, 1).cuboid(-1.0F, -18.0F, 0.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(143, 10).cuboid(0.0F, -18.0F, 1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(5, 143).cuboid(0.0F, -18.0F, 1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(5, 143).cuboid(-5.0F, -18.0F, 1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(41, 155).cuboid(1.0F, -19.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 20.0F, -7.0F));

		ModelPartData chest = wendigo.addChild("chest", ModelPartBuilder.create().uv(20, 32).cuboid(-8.0F, -55.0F, 4.0F, 12.0F, 12.0F, 4.0F, new Dilation(0.0F))
		.uv(40, 4).cuboid(-7.0F, -52.0F, 3.0F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(15, 0).cuboid(-1.0F, -52.0F, 3.0F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F))
		.uv(61, 0).cuboid(-7.0F, -52.0F, 7.0F, 10.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 28.0F, 0.0F));

		ModelPartData cube_r8 = chest.addChild("cube_r8", ModelPartBuilder.create().uv(56, 53).cuboid(15.0F, -43.0F, -1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0756F, -0.0436F, -0.5219F));

		ModelPartData cube_r9 = chest.addChild("cube_r9", ModelPartBuilder.create().uv(40, 24).cuboid(-22.0F, -41.0F, -1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0756F, 0.0436F, 0.5219F));

		ModelPartData cube_r10 = chest.addChild("cube_r10", ModelPartBuilder.create().uv(52, 40).cuboid(11.0F, -44.0F, -1.0F, 7.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0832F, -0.0262F, -0.3043F));

		ModelPartData cube_r11 = chest.addChild("cube_r11", ModelPartBuilder.create().uv(82, 73).cuboid(-27.0F, -40.0F, -1.0F, 6.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.0791F, 0.0368F, 0.4349F));

		ModelPartData stomach = wendigo.addChild("stomach", ModelPartBuilder.create().uv(14, 59).cuboid(-5.0F, -39.0F, 3.0F, 6.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 28.0F, 0.0F));

		ModelPartData cube_r12 = stomach.addChild("cube_r12", ModelPartBuilder.create().uv(20, 48).cuboid(39.0F, -3.0F, 3.0F, 6.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.6144F));

		ModelPartData cube_r13 = stomach.addChild("cube_r13", ModelPartBuilder.create().uv(38, 53).cuboid(36.0F, 15.0F, 3.0F, 6.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0944F));

		ModelPartData cube_r14 = stomach.addChild("cube_r14", ModelPartBuilder.create().uv(56, 56).cuboid(31.0F, -26.0F, 3.0F, 6.0F, 3.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9163F));

		ModelPartData topofthighs = wendigo.addChild("topofthighs", ModelPartBuilder.create().uv(122, 142).cuboid(1.0F, -34.0F, 4.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(141, 132).cuboid(-3.0F, -30.0F, 10.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(140, 104).cuboid(-3.0F, -32.0F, 0.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(61, 12).cuboid(0.0F, -37.0F, 4.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(80, 142).cuboid(-3.0F, -34.0F, 8.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(38, 48).cuboid(-3.0F, -37.0F, 7.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(140, 98).cuboid(-7.0F, -30.0F, 1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(139, 0).cuboid(-7.0F, -30.0F, 3.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(139, 6).cuboid(-7.0F, -30.0F, 5.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(100, 140).cuboid(-3.0F, -30.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(108, 140).cuboid(-3.0F, -34.0F, 1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(40, 27).cuboid(-3.0F, -37.0F, 2.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(68, 41).cuboid(-6.0F, -37.0F, 4.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(72, 141).cuboid(-1.0F, -30.0F, 9.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 142).cuboid(-3.0F, -32.0F, 9.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(142, 114).cuboid(2.0F, -32.0F, 4.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(92, 142).cuboid(3.0F, -30.0F, 4.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(134, 142).cuboid(-8.0F, -32.0F, 4.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(141, 126).cuboid(3.0F, -30.0F, 6.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(140, 86).cuboid(1.0F, -30.0F, 2.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(10, 140).cuboid(1.0F, -30.0F, 5.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(66, 139).cuboid(1.0F, -30.0F, 4.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(140, 110).cuboid(-5.0F, -30.0F, 9.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(140, 74).cuboid(-5.0F, -30.0F, 7.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(140, 51).cuboid(-5.0F, -30.0F, 5.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(139, 20).cuboid(-3.0F, -30.0F, 5.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(34, 140).cuboid(-5.0F, -30.0F, 3.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(139, 26).cuboid(-3.0F, -30.0F, 3.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(26, 140).cuboid(-5.0F, -30.0F, 2.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(140, 68).cuboid(-3.0F, -30.0F, 7.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(140, 59).cuboid(-1.0F, -30.0F, 7.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(140, 92).cuboid(-5.0F, -30.0F, 0.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(139, 14).cuboid(-3.0F, -30.0F, 1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(141, 120).cuboid(1.0F, -30.0F, 7.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(128, 140).cuboid(-7.0F, -30.0F, 7.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(128, 140).cuboid(-12.0F, -24.0F, 6.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(86, 140).cuboid(-1.0F, -30.0F, 0.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(58, 139).cuboid(-1.0F, -30.0F, 2.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(139, 32).cuboid(-1.0F, -30.0F, 3.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(50, 139).cuboid(-1.0F, -30.0F, 5.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(114, 142).cuboid(-9.0F, -30.0F, 4.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(142, 142).cuboid(-7.0F, -34.0F, 4.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(42, 141).cuboid(-9.0F, -30.0F, 6.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(140, 80).cuboid(-10.0F, -28.0F, 6.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(114, 138).cuboid(4.0F, -28.0F, 6.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(94, 138).cuboid(5.0F, -26.0F, 6.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(137, 55).cuboid(6.0F, -24.0F, 6.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F))
		.uv(138, 138).cuboid(-11.0F, -26.0F, 6.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 28.0F, 0.0F));

		ModelPartData cube_r15 = topofthighs.addChild("cube_r15", ModelPartBuilder.create().uv(17, 160).cuboid(-13.0F, -33.0F, 5.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		ModelPartData cube_r16 = topofthighs.addChild("cube_r16", ModelPartBuilder.create().uv(21, 160).cuboid(9.0F, -33.0F, 5.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		ModelPartData rightleg = wendigo.addChild("rightleg", ModelPartBuilder.create().uv(0, 32).cuboid(-3.0F, -1.0F, -2.0F, 5.0F, 27.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 1.0F, 5.0F));

		ModelPartData cube_r17 = rightleg.addChild("cube_r17", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -13.0F, 2.0F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 19.0F, -5.0F, 0.0F, 0.0F, -0.5236F));

		ModelPartData cube_r18 = rightleg.addChild("cube_r18", ModelPartBuilder.create().uv(1, 1).cuboid(-3.0F, -8.0F, 0.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 15.0F, -3.0F, 0.0F, 0.0F, 0.48F));

		ModelPartData rightfoot = rightleg.addChild("rightfoot", ModelPartBuilder.create().uv(40, 0).cuboid(-1.0F, -1.0F, -2.0F, 5.0F, 1.0F, 11.0F, new Dilation(0.0F))
		.uv(61, 7).cuboid(-1.0F, -2.0F, -3.0F, 5.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 27.0F, -5.0F));

		ModelPartData bone6 = rightleg.addChild("bone6", ModelPartBuilder.create(), ModelTransform.pivot(4.0F, 22.0F, 1.0F));

		ModelPartData cube_r19 = bone6.addChild("cube_r19", ModelPartBuilder.create().uv(47, 159).cuboid(11.0F, 1.0F, 2.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.3126F));

		ModelPartData cube_r20 = bone6.addChild("cube_r20", ModelPartBuilder.create().uv(51, 159).cuboid(0.0F, -14.0F, 2.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));

		ModelPartData bone5 = rightleg.addChild("bone5", ModelPartBuilder.create(), ModelTransform.pivot(4.0F, 19.0F, -5.0F));

		ModelPartData leftleg = wendigo.addChild("leftleg", ModelPartBuilder.create().uv(20, 0).cuboid(-2.0F, -1.0F, -2.0F, 5.0F, 27.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, 1.0F, 5.0F));

		ModelPartData cube_r21 = leftleg.addChild("cube_r21", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -22.0F, 2.0F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F))
		.uv(0, 0).cuboid(-9.0F, -10.0F, 2.0F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(11.0F, 19.0F, -5.0F, 0.0F, 0.0F, -0.5236F));

		ModelPartData cube_r22 = leftleg.addChild("cube_r22", ModelPartBuilder.create().uv(1, 1).cuboid(-5.0F, 1.0F, 0.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, 15.0F, -3.0F, 0.0F, 0.0F, 0.48F));

		ModelPartData cube_r23 = leftleg.addChild("cube_r23", ModelPartBuilder.create().uv(20, 48).cuboid(-1.0F, -23.0F, 2.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(11.0F, 22.0F, 1.0F, 0.0F, 0.0F, -0.5236F));

		ModelPartData leftfoot = leftleg.addChild("leftfoot", ModelPartBuilder.create().uv(40, 12).cuboid(-7.0F, -1.0F, -2.0F, 5.0F, 1.0F, 11.0F, new Dilation(0.0F))
		.uv(35, 0).cuboid(-7.0F, -2.0F, -3.0F, 5.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, 27.0F, -5.0F));

		ModelPartData bone2 = leftleg.addChild("bone2", ModelPartBuilder.create(), ModelTransform.pivot(5.0F, 27.0F, -5.0F));

		ModelPartData rightshoulder = wendigo.addChild("rightshoulder", ModelPartBuilder.create(), ModelTransform.pivot(7.0959F, -24.1349F, 10.1277F));

		ModelPartData cube_r24 = rightshoulder.addChild("cube_r24", ModelPartBuilder.create().uv(74, 59).cuboid(-39.0F, -33.0F, 35.0F, 2.0F, 2.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 77).cuboid(-39.0F, -33.0F, 29.0F, 2.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-8.0959F, 52.1349F, -10.1277F, 1.1709F, 0.6956F, 0.9878F));

		ModelPartData cube_r25 = rightshoulder.addChild("cube_r25", ModelPartBuilder.create().uv(61, 12).cuboid(15.0F, -46.0F, 38.0F, 2.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(61, 12).cuboid(14.0F, -46.0F, 29.0F, 2.0F, 2.0F, 8.0F, new Dilation(0.0F))
		.uv(61, 12).cuboid(9.0F, -46.0F, 31.0F, 2.0F, 2.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(-8.0959F, 52.1349F, -10.1277F, 0.48F, 0.0F, 0.0F));

		ModelPartData rightshoulder_r1 = rightshoulder.addChild("rightshoulder_r1", ModelPartBuilder.create().uv(48, 24).cuboid(11.0F, -54.0F, 3.0F, 7.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-8.0959F, 52.1349F, -10.1277F, 0.0F, 0.0F, -0.1309F));

		ModelPartData rightupperarm = rightshoulder.addChild("rightupperarm", ModelPartBuilder.create(), ModelTransform.pivot(0.9041F, 5.1349F, -5.1277F));

		ModelPartData cube_r26 = rightupperarm.addChild("cube_r26", ModelPartBuilder.create().uv(0, 0).cuboid(10.0F, -46.0F, 6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 2).cuboid(11.0F, -45.0F, 6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 32).cuboid(12.0F, -44.0F, 6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(20, 32).cuboid(13.0F, -43.0F, 6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 34).cuboid(14.0F, -42.0F, 6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(40, 9).cuboid(14.0F, -43.0F, 5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(44, 9).cuboid(14.0F, -44.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(46, 27).cuboid(14.0F, -45.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(47, 12).cuboid(13.0F, -46.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(48, 24).cuboid(12.0F, -47.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(48, 34).cuboid(11.0F, -48.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(49, 26).cuboid(10.0F, -49.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-9.0F, 47.0F, -5.0F, 0.0F, 0.0F, -0.0873F));

		ModelPartData cube_r27 = rightupperarm.addChild("cube_r27", ModelPartBuilder.create().uv(56, 65).cuboid(10.0F, -50.0F, 1.0F, 5.0F, 9.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-9.0F, 47.0F, -5.0F, -0.0435F, -0.0038F, -0.0872F));

		ModelPartData rightarm = rightupperarm.addChild("rightarm", ModelPartBuilder.create(), ModelTransform.pivot(2.0F, 13.0F, -3.0F));

		ModelPartData cube_r28 = rightarm.addChild("cube_r28", ModelPartBuilder.create().uv(82, 80).cuboid(-1.0F, -5.5F, -1.5F, 2.0F, 10.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.9022F, 4.2391F, -1.5397F, -0.3047F, 0.0206F, -0.0033F));

		ModelPartData cube_r29 = rightarm.addChild("cube_r29", ModelPartBuilder.create().uv(0, 64).cuboid(10.0F, -41.0F, -12.0F, 5.0F, 9.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-11.0F, 34.0F, -2.0F, -0.3489F, -0.0038F, -0.0872F));

		ModelPartData righthand = rightarm.addChild("righthand", ModelPartBuilder.create(), ModelTransform.pivot(-11.0F, 34.0F, -2.0F));

		ModelPartData cube_r30 = righthand.addChild("cube_r30", ModelPartBuilder.create().uv(73, 7).cuboid(6.0F, -24.0F, -12.0F, 4.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3466F, 0.0409F, 0.0359F));

		ModelPartData cube_r31 = righthand.addChild("cube_r31", ModelPartBuilder.create().uv(68, 46).cuboid(7.0F, -19.0F, -8.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(52, 34).cuboid(4.0F, -18.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(65, 17).cuboid(10.0F, -19.0F, -9.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(56, 66).cuboid(7.0F, -19.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(52, 36).cuboid(4.0F, -19.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(0, 64).cuboid(5.0F, -20.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 68).cuboid(7.0F, -18.0F, -9.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(93, 160).cuboid(7.0F, -24.0F, -7.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2502F, 0.0012F, 0.0547F));

		ModelPartData cube_r32 = righthand.addChild("cube_r32", ModelPartBuilder.create().uv(0, 66).cuboid(4.0F, -14.0F, 17.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(38, 65).cuboid(5.0F, -13.0F, 17.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.7243F, 1.3367F, -2.0658F));

		ModelPartData cube_r33 = righthand.addChild("cube_r33", ModelPartBuilder.create().uv(10, 77).cuboid(15.0F, -19.0F, -8.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3267F, -0.0734F, -0.2417F));

		ModelPartData cube_r34 = righthand.addChild("cube_r34", ModelPartBuilder.create().uv(0, 77).cuboid(1.0F, -25.0F, -10.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2443F, 0.0548F, 0.2663F));

		ModelPartData leftarm = wendigo.addChild("leftarm", ModelPartBuilder.create(), ModelTransform.pivot(-12.6872F, -24.3568F, 2.441F));

		ModelPartData leftarm_r1 = leftarm.addChild("leftarm_r1", ModelPartBuilder.create().uv(39, 63).cuboid(-2.0F, -3.0F, -0.5F, 4.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-0.1143F, 15.0993F, 3.059F, 2.9234F, 0.0F, 0.0873F));

		ModelPartData rightshoulder_r2 = leftarm.addChild("rightshoulder_r2", ModelPartBuilder.create().uv(48, 24).cuboid(-3.012F, -2.0176F, -2.0F, 7.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.6872F, -0.6432F, 2.559F, 0.0F, 0.0F, 0.0873F));

		ModelPartData cube_r35 = leftarm.addChild("cube_r35", ModelPartBuilder.create().uv(82, 80).cuboid(-15.0F, -33.0F, -11.0F, 2.0F, 9.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(12.6872F, 52.3568F, -2.441F, -0.3466F, 0.0409F, 0.0359F));

		ModelPartData lefthand = leftarm.addChild("lefthand", ModelPartBuilder.create(), ModelTransform.pivot(12.6872F, 52.3568F, -2.441F));

		ModelPartData cube_r36 = lefthand.addChild("cube_r36", ModelPartBuilder.create().uv(69, 73).cuboid(-16.0F, -24.0F, -12.0F, 4.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.3466F, 0.0409F, 0.0359F));

		ModelPartData cube_r37 = lefthand.addChild("cube_r37", ModelPartBuilder.create().uv(61, 17).cuboid(-15.0F, -18.0F, -9.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F))
		.uv(70, 67).cuboid(-11.0F, -21.0F, -12.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(18, 70).cuboid(-18.0F, -18.0F, -11.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(70, 65).cuboid(-18.0F, -19.0F, -10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(72, 28).cuboid(-15.0F, -19.0F, -7.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(119, 160).cuboid(-15.0F, -23.0F, -6.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2502F, 0.0012F, 0.0547F));

		ModelPartData cube_r38 = lefthand.addChild("cube_r38", ModelPartBuilder.create().uv(97, 160).cuboid(-22.0F, -19.0F, -9.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2418F, 0.0653F, 0.3087F));

		ModelPartData cube_r39 = lefthand.addChild("cube_r39", ModelPartBuilder.create().uv(144, 160).cuboid(1.0F, -25.0F, -13.0F, 1.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.4021F, -0.1664F, -0.5016F));

		ModelPartData bone = lefthand.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData cube_r40 = bone.addChild("cube_r40", ModelPartBuilder.create().uv(57, 57).cuboid(-11.0F, -20.0F, -11.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
		.uv(32, 59).cuboid(-11.0F, -20.0F, -10.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2502F, 0.0012F, 0.0547F));

		ModelPartData topofleftthigh = lefthand.addChild("topofleftthigh", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData topofrightthigh = lefthand.addChild("topofrightthigh", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData leftupperarm = leftarm.addChild("leftupperarm", ModelPartBuilder.create(), ModelTransform.pivot(0.6872F, 5.3568F, 3.559F));

		ModelPartData cube_r41 = leftupperarm.addChild("cube_r41", ModelPartBuilder.create().uv(10, 79).cuboid(15.0F, -32.0F, 32.0F, 1.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, 47.0F, -6.0F, 0.7867F, -0.6284F, -0.584F));

		ModelPartData cube_r42 = leftupperarm.addChild("cube_r42", ModelPartBuilder.create().uv(74, 34).cuboid(3.0F, -31.0F, 32.0F, 2.0F, 2.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, 47.0F, -6.0F, 0.7037F, -0.3651F, -0.3217F));

		ModelPartData cube_r43 = leftupperarm.addChild("cube_r43", ModelPartBuilder.create().uv(33, 160).cuboid(29.0F, -59.0F, 5.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, 47.0F, -6.0F, 0.0F, 0.0F, -0.7854F));

		ModelPartData cube_r44 = leftupperarm.addChild("cube_r44", ModelPartBuilder.create().uv(78, 160).cuboid(9.0F, -61.0F, 5.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, 47.0F, -6.0F, 0.0F, 0.0F, -0.4363F));

		ModelPartData leftarm_r2 = leftupperarm.addChild("left arm_r2", ModelPartBuilder.create().uv(38, 62).cuboid(-18.0F, -49.0F, 3.0F, 4.0F, 8.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(12.0F, 47.0F, -6.0F, 0.0F, 0.0F, 0.0873F));

		ModelPartData leftshoulder = leftarm.addChild("leftshoulder", ModelPartBuilder.create(), ModelTransform.pivot(12.6872F, 52.3568F, -2.441F));

		ModelPartData cube_r45 = leftshoulder.addChild("cube_r45", ModelPartBuilder.create().uv(25, 160).cuboid(-34.0F, -57.0F, 8.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0218F, -0.0378F, 0.2614F));

		ModelPartData cube_r46 = leftshoulder.addChild("cube_r46", ModelPartBuilder.create().uv(29, 160).cuboid(63.0F, -8.0F, 8.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0235F, 0.0368F, -1.7885F));
		return TexturedModelData.of(modelData, 256, 256);
	}
	@Override
	public void setAngles(WendigoEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.WENDIGO_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.WENDIGO_IDLE, ageInTicks, 1f);
		this.updateAnimation(entity.attackAnimationState, ModAnimations.WENDIGO_ATTACK, ageInTicks, 1f);

	}

	private void setHeadAngles(float headYaw, float headPitch){
		headYaw = MathHelper.clamp(headYaw,-30.0f, 30.0f);
		headPitch = MathHelper.clamp(headPitch, -25.0f, 45.0f);

	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		wendigo.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return wendigo;
	}
}