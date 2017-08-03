package com.meteor.extrabotany.client.render.entity;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.meteor.extrabotany.common.entity.EntitySakuraFall;

public class RenderSakuraFall extends Render {
    private static double[][] dVec = {{     0,     1,  -0.5},  // 픵�0
        {     0,  0.75,     0},  // 픵�1
        {   0.1,   0.6, -0.15},  // 픵�2
        {     0,   0.5, -0.25},  // 픵�3
        {  -0.1,   0.6, -0.15},  // 픵�4
        {     0,     0,  0.25},  // 픵�5
        {  0.25,     0,     0},  // 픵�6
        {     0,     0, -0.25},  // 픵�7
        { -0.25,     0,     0},  // 픵�8
        {     0, -0.75,     0},  // 픵�9
        {   0.1,  -0.6, -0.15},  // 픵�10
        {     0,  -0.5, -0.25},  // 픵�11
        {  -0.1,  -0.6, -0.15},  // 픵�12
        {     0,    -1,  -0.5}}; // 픵�13

    private static int[][] nVecPos = {{ 0,  1,  2,  3},  //��1(픵� 0, 1, 2, 3)
        { 0,  3,  4,  1},  //��2
        { 1,  5,  6,  2},  //��3
        { 3,  2,  6,  7},  //��4
        { 3,  7,  8,  4},  //��5
        { 1,  4,  8,  5},  //��6
        { 6,  5,  9, 10},  //��7
        { 6, 10, 11,  7},  //��8
        { 8,  7, 11, 12},  //��9
        { 8, 12,  9,  5},  //��10
        {10,  9, 13, 11},  //��11
        {12, 11, 13,  9}}; //��12

    @Override
    public void doRender(Entity entity, double d0, double d1, double d2, float f, float f1)
    {
        if (entity instanceof EntitySakuraFall)
        {
            doDriveRender((EntitySakuraFall) entity, d0, d1, d2, f, f1);
        }
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
        return null;
    }

    private void doDriveRender(EntitySakuraFall entityDrive, double dX, double dY, double dZ, float f, float f1)
    {
        Tessellator tessellator = Tessellator.instance;
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
        //GL11.glBlendFunc(GL11.GL_ONE, GL11.GL_ONE);
        //GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

        GL11.glPushMatrix();

        GL11.glTranslatef((float)dX, (float)dY, (float)dZ);
        GL11.glRotatef(entityDrive.rotationYaw, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-entityDrive.rotationPitch, 1.0F, 0.0F, 0.0F);
        GL11.glRotatef(90F,0,0,1);
        //GL11.glRotatef(fRot, 0.0F, 1.0F, 0.0F);

        GL11.glScalef(0.25f, 1, 1);
        GL11.glScalef(2F, 2F, 2F);
        
        //�������`��
        float ticks = entityDrive.ticksExisted;
        tessellator.startDrawingQuads();
        tessellator.setColorRGBA_F(0.96F, 0.58F, 0.66F, 0.95f);

        //��픵���h �_ʼ
        double dScale = 1.0;
        for(int idx = 0; idx < nVecPos.length; idx++)
        {
            //tessellator.setColorRGBA_F(fScale, 1.0F, 1.0F, 0.2F + (float)idx*0.02F);
            tessellator.addVertex(dVec[nVecPos[idx][0]][0] * dScale, dVec[nVecPos[idx][0]][1] * dScale, dVec[nVecPos[idx][0]][2] * dScale);
            tessellator.addVertex(dVec[nVecPos[idx][1]][0] * dScale, dVec[nVecPos[idx][1]][1] * dScale, dVec[nVecPos[idx][1]][2] * dScale);
            tessellator.addVertex(dVec[nVecPos[idx][2]][0] * dScale, dVec[nVecPos[idx][2]][1] * dScale, dVec[nVecPos[idx][2]][2] * dScale);
            tessellator.addVertex(dVec[nVecPos[idx][3]][0] * dScale, dVec[nVecPos[idx][3]][1] * dScale, dVec[nVecPos[idx][3]][2] * dScale);
        }

        //��픵���h �K��

        tessellator.draw();

        GL11.glPopMatrix();
        GL11.glDisable(GL11.GL_BLEND);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
    }

}
