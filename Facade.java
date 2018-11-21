package com.example.echo;

import com.google.api.server.spi.auth.EspAuthenticator;
import com.google.api.server.spi.auth.common.User;
import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiIssuer;
import com.google.api.server.spi.config.ApiIssuerAudience;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.Nullable;
import com.google.api.server.spi.response.UnauthorizedException;
import java.util.ArrayList;

@Api(
    name = "facade",
    version = "v1",
    namespace =
    @ApiNamespace(
        ownerDomain = "echo.example.com",
        ownerName = "echo.example.com",
        packagePath = ""
    )
    // [START_EXCLUDE]

// [END_EXCLUDE]
)
public class Facade{
