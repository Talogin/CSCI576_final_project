//Shot class
public class Shot {
    int sFrame, eFrame;
    int sampleNum;
    double avgAudio;
    int contentLabel;
    int possibleLogos[];

    public Shot(int start, int end) {
        sFrame = start;
        eFrame = end;
        sampleNum = 0;
        avgAudio = 0.0;
        contentLabel = 0;
        possibleLogos = new int[3];
    }
    public void plusAudioSample(double audio) {
        avgAudio += audio;
        ++sampleNum;
    }
    public void calAvgAudio() {
        avgAudio = sampleNum == 0 ? 0.0 : avgAudio / sampleNum;
    }
}
