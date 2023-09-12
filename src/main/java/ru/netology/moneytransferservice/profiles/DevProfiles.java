package ru.netology.moneytransferservice.profiles;

public class DevProfiles implements SystemProfile{
    @Override
    public String getProfile() {
        return "Current profile is Dev";
    }
}