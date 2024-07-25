# starling-spending-accountability
This repo is designed to be a 3rd party plugin for starling
The idea is as follows: as your spending is split into sections, when one of those sections exceeds a target, you recieve some sort of notification, that lets you know that you're overspending

Endpoint this will use  is:
https://api.starlingbank.com/api/v2/accounts/{account-uuid}/spending-insights/spending-category?year=2024&month=JULY - https://developer.starlingbank.com/docs#api-reference-1


Turns out to properly authenticate you need to have some sort of certificate, so this will remain a personal project with dev tokens for the foreseeable