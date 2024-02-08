package com.abahafart.userms;

import org.jeasy.random.EasyRandom;
import org.jeasy.random.EasyRandomParameters;

public class EasyRandomCore {

  private EasyRandomCore() {}

  private static final int RANDOM_LIST_SIZE_END = 5;
  private static final int RANDOM_LIST_SIZE_INI = 1;

  public static EasyRandom easyRandomStatic() {
    EasyRandomParameters randomParameters =
        new EasyRandomParameters().collectionSizeRange(RANDOM_LIST_SIZE_INI, RANDOM_LIST_SIZE_END);
    return new EasyRandom(randomParameters);
  }
}
