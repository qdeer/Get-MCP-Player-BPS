Minecraft mc = Minecraft.getMinecraft();

Vec3 vec = new Vec3(mc.thePlayer.lastTickPosX, mc.thePlayer.lastTickPosY, mc.thePlayer.lastTickPosZ);
DecimalFormat decFormat = new DecimalFormat();
Dawn.addChatMessage(String.valueOf(decFormat.format(mc.thePlayer.getPositionVector().distanceTo(vec) * 20)));
