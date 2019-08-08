package com.tempo.challenge;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.tempo.challenge.entity.product.ProductTest;
import com.tempo.challenge.entity.product.VideoTest;
import com.tempo.challenge.entity.user.MemberShipTest;
import com.tempo.challenge.entity.user.UserTest;
import com.tempo.challenge.service.order.ActivateMemberShipTest;
import com.tempo.challenge.service.order.AddFreeFirstAidTest;
import com.tempo.challenge.service.order.GenerateCommissionPaymentTest;
import com.tempo.challenge.service.order.PackingSlipTest;
import com.tempo.challenge.service.order.SendEmailTest;
import com.tempo.challenge.service.order.UpgradeMemberShipTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  ActivateMemberShipTest.class,
  AddFreeFirstAidTest.class,
  PackingSlipTest.class,
  SendEmailTest.class,
  UpgradeMemberShipTest.class,
  MemberShipTest.class,
  UserTest.class,
  com.tempo.challenge.entity.product.MemberShipTest.class,
  ProductTest.class,
  VideoTest.class,
  GenerateCommissionPaymentTest.class
})

public class TestSuite {}
