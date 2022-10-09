Minecraft mc = Minecraft.getMinecraft();

Vec3 vec = new Vec3(mc.thePlayer.lastTickPosX, mc.thePlayer.lastTickPosY, mc.thePlayer.lastTickPosZ);
double bps = mc.thePlayer.getPositionVector().distanceTo(vec) * 20;
