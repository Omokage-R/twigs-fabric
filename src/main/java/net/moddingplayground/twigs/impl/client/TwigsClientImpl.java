package net.moddingplayground.twigs.impl.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.moddingplayground.frame.api.contentregistries.v0.client.SplashesRegistry;
import net.moddingplayground.frame.api.util.InitializationLogger;
import net.moddingplayground.twigs.api.Twigs;

import java.util.List;

@Environment(EnvType.CLIENT)
public final class TwigsClientImpl implements Twigs, ClientModInitializer {
    private final InitializationLogger initializer;

    public TwigsClientImpl() {
        this.initializer = new InitializationLogger(LOGGER, MOD_NAME, EnvType.CLIENT);
    }

    @Override
    public void onInitializeClient() {
        this.initializer.start();

        List.of(
            "Why no chairs?",
            "___ __ ____"
        ).forEach(SplashesRegistry.INSTANCE::register);

        this.initializer.finish();
    }
}
