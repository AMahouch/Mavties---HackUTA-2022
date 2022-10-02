// Download the helper library from https://www.twilio.com/docs/node/install
// Find your Account SID and Auth Token at twilio.com/console
// and set the environment variables. See http://twil.io/secure

require('dotenv').config();
var client = require('twilio')(process.env.TWILIO_ACCOUNT_SID, process.env.TWILIO_TOKEN);

client.calls
      .create({
         url: 'http://demo.twilio.com/docs/voice.xml',
         to: '+14693454931',
         from: '+14797770106'
       })
      .then(call => console.log(call.sid));
