package builder.tradition;

/**
 * @Author hgk
 * @Date 2021/9/8 19:52
 * @description
 */
public abstract class AbstractHouse {

    //打地基
    public abstract void buildBasic();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void roofed();

    // 盖房子过程
    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
