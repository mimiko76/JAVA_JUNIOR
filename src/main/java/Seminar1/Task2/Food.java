package Seminar1.Task2;

/**
 * Еда
 */
public interface Food extends Thing{
    /**
     * Получить наличие протеинов в еде
     * @return ниличие протеинов
     */
    boolean getProteins();

    /**
     * Получить наличие жиров в еде
     * @return ниличие жиров
     */
    boolean getFats();

    /**
     * Получить наличие углеводов в еде
     * @return ниличие углеводов
     */
    boolean getCarbohydrates();
}
