import { CapacitorConfig } from '@capacitor/cli';

const config: CapacitorConfig = {
  appId: 'com.s1vann.payplayer',
  appName: 'Pay-Player',
  webDir: 'www',
  server: {
    url: 'https://plusdash.vercel.app',
    cleartext: false
  }
};

export default config;
