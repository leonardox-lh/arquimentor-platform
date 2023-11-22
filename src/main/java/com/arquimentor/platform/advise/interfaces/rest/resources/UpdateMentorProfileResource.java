package com.arquimentor.platform.advise.interfaces.rest.resources;

import java.util.List;

public record UpdateMentorProfileResource(
        String nick,
        String phoneNumber,
        String slogan,
        String userProfilePhoto,
        List<String> certificates

) {
}
