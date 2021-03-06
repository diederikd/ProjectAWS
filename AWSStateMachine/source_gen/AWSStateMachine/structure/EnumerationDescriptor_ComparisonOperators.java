package AWSStateMachine.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.EnumerationDescriptorBase;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import java.util.Arrays;

public class EnumerationDescriptor_ComparisonOperators extends EnumerationDescriptorBase {

  public EnumerationDescriptor_ComparisonOperators() {
    super(0xad34076bb44b4b8eL, 0x9aa6566fa22fe764L, 0x4c74ef895ad44d0aL, "ComparisonOperators", "r:393117f7-cc47-4543-83a6-7f3b110b90e7(AWSStateMachine.structure)/5509291617394380042", PrimitiveTypeId.STRING);
  }

  private final EnumerationDescriptor.MemberDescriptor VALUE_BooleanEquals_0 = new EnumerationDescriptor.MemberDescriptor("BooleanEquals", "BooleanEquals", "r:393117f7-cc47-4543-83a6-7f3b110b90e7(AWSStateMachine.structure)/5509291617394380044", "BooleanEquals");
  private final EnumerationDescriptor.MemberDescriptor VALUE_NumericEquals_0 = new EnumerationDescriptor.MemberDescriptor("NumericEquals", "NumericEquals", "r:393117f7-cc47-4543-83a6-7f3b110b90e7(AWSStateMachine.structure)/5509291617394380051", "NumericEquals");
  private final EnumerationDescriptor.MemberDescriptor VALUE_NumericGreaterThan_0 = new EnumerationDescriptor.MemberDescriptor("NumericGreaterThan", "NumericGreaterThan", "r:393117f7-cc47-4543-83a6-7f3b110b90e7(AWSStateMachine.structure)/5509291617394380056", "NumericGreaterThan");
  private final EnumerationDescriptor.MemberDescriptor VALUE_NumericGreaterThanEquals_0 = new EnumerationDescriptor.MemberDescriptor("NumericGreaterThanEquals", "NumericGreaterThanEquals", "r:393117f7-cc47-4543-83a6-7f3b110b90e7(AWSStateMachine.structure)/5509291617394380062", "NumericGreaterThanEquals");
  private final EnumerationDescriptor.MemberDescriptor VALUE_NumericLessThan_0 = new EnumerationDescriptor.MemberDescriptor("NumericLessThan", "NumericLessThan", "r:393117f7-cc47-4543-83a6-7f3b110b90e7(AWSStateMachine.structure)/5509291617394380069", "NumericLessThan");
  private final EnumerationDescriptor.MemberDescriptor VALUE_NumericLessThanEquals_0 = new EnumerationDescriptor.MemberDescriptor("NumericLessThanEquals", "NumericLessThanEquals", "r:393117f7-cc47-4543-83a6-7f3b110b90e7(AWSStateMachine.structure)/5509291617394380077", "NumericLessThanEquals");
  private final EnumerationDescriptor.MemberDescriptor VALUE_StringEquals_0 = new EnumerationDescriptor.MemberDescriptor("StringEquals", "StringEquals", "r:393117f7-cc47-4543-83a6-7f3b110b90e7(AWSStateMachine.structure)/5509291617394380096", "StringEquals");
  private final EnumerationDescriptor.MemberDescriptor VALUE_StringGreaterThan_0 = new EnumerationDescriptor.MemberDescriptor("StringGreaterThan", "StringGreaterThan", "r:393117f7-cc47-4543-83a6-7f3b110b90e7(AWSStateMachine.structure)/5509291617394380107", "StringGreaterThan");
  private final EnumerationDescriptor.MemberDescriptor VALUE_StringGreaterThanEquals_0 = new EnumerationDescriptor.MemberDescriptor("StringGreaterThanEquals", "StringGreaterThanEquals", "r:393117f7-cc47-4543-83a6-7f3b110b90e7(AWSStateMachine.structure)/5509291617394380119", "StringGreaterThanEquals");
  private final EnumerationDescriptor.MemberDescriptor VALUE_StringLessThan_0 = new EnumerationDescriptor.MemberDescriptor("StringLessThan", "StringLessThan", "r:393117f7-cc47-4543-83a6-7f3b110b90e7(AWSStateMachine.structure)/5509291617394380132", "StringLessThan");
  private final EnumerationDescriptor.MemberDescriptor VALUE_StringLessThanEquals_0 = new EnumerationDescriptor.MemberDescriptor("StringLessThanEquals", "StringLessThanEquals", "r:393117f7-cc47-4543-83a6-7f3b110b90e7(AWSStateMachine.structure)/5509291617394380146", "StringLessThanEquals");
  private final EnumerationDescriptor.MemberDescriptor VALUE_TimestampEquals_0 = new EnumerationDescriptor.MemberDescriptor("TimestampEquals", "TimestampEquals", "r:393117f7-cc47-4543-83a6-7f3b110b90e7(AWSStateMachine.structure)/5509291617394380161", "TimestampEquals");
  private final EnumerationDescriptor.MemberDescriptor VALUE_TimestampGreaterThan_0 = new EnumerationDescriptor.MemberDescriptor("TimestampGreaterThan", "TimestampGreaterThan", "r:393117f7-cc47-4543-83a6-7f3b110b90e7(AWSStateMachine.structure)/5509291617394380177", "TimestampGreaterThan");
  private final EnumerationDescriptor.MemberDescriptor VALUE_TimestampGreaterThanEquals_0 = new EnumerationDescriptor.MemberDescriptor("TimestampGreaterThanEquals", "TimestampGreaterThanEquals", "r:393117f7-cc47-4543-83a6-7f3b110b90e7(AWSStateMachine.structure)/5509291617394380194", "TimestampGreaterThanEquals");
  private final EnumerationDescriptor.MemberDescriptor VALUE_TimestampLessThan_0 = new EnumerationDescriptor.MemberDescriptor("TimestampLessThan", "TimestampLessThan", "r:393117f7-cc47-4543-83a6-7f3b110b90e7(AWSStateMachine.structure)/5509291617394380212", "TimestampLessThan");
  private final EnumerationDescriptor.MemberDescriptor VALUE_TimestampLessThanEquals_0 = new EnumerationDescriptor.MemberDescriptor("TimestampLessThanEquals", "TimestampLessThanEquals", "r:393117f7-cc47-4543-83a6-7f3b110b90e7(AWSStateMachine.structure)/5509291617394380231", "TimestampLessThanEquals");

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getDefault() {
    return VALUE_StringEquals_0;
  }

  @NotNull
  @Override
  public Collection<EnumerationDescriptor.MemberDescriptor> getMembers() {
    return Arrays.asList(VALUE_BooleanEquals_0, VALUE_NumericEquals_0, VALUE_NumericGreaterThan_0, VALUE_NumericGreaterThanEquals_0, VALUE_NumericLessThan_0, VALUE_NumericLessThanEquals_0, VALUE_StringEquals_0, VALUE_StringGreaterThan_0, VALUE_StringGreaterThanEquals_0, VALUE_StringLessThan_0, VALUE_StringLessThanEquals_0, VALUE_TimestampEquals_0, VALUE_TimestampGreaterThan_0, VALUE_TimestampGreaterThanEquals_0, VALUE_TimestampLessThan_0, VALUE_TimestampLessThanEquals_0);
  }

  @Nullable
  @Override
  public EnumerationDescriptor.MemberDescriptor getMember(@Nullable String string) {
    if (string == null) {
      return null;
    }
    switch (string) {
      case "BooleanEquals":
        return VALUE_BooleanEquals_0;
      case "NumericEquals":
        return VALUE_NumericEquals_0;
      case "NumericGreaterThan":
        return VALUE_NumericGreaterThan_0;
      case "NumericGreaterThanEquals":
        return VALUE_NumericGreaterThanEquals_0;
      case "NumericLessThan":
        return VALUE_NumericLessThan_0;
      case "NumericLessThanEquals":
        return VALUE_NumericLessThanEquals_0;
      case "StringEquals":
        return VALUE_StringEquals_0;
      case "StringGreaterThan":
        return VALUE_StringGreaterThan_0;
      case "StringGreaterThanEquals":
        return VALUE_StringGreaterThanEquals_0;
      case "StringLessThan":
        return VALUE_StringLessThan_0;
      case "StringLessThanEquals":
        return VALUE_StringLessThanEquals_0;
      case "TimestampEquals":
        return VALUE_TimestampEquals_0;
      case "TimestampGreaterThan":
        return VALUE_TimestampGreaterThan_0;
      case "TimestampGreaterThanEquals":
        return VALUE_TimestampGreaterThanEquals_0;
      case "TimestampLessThan":
        return VALUE_TimestampLessThan_0;
      case "TimestampLessThanEquals":
        return VALUE_TimestampLessThanEquals_0;
    }
    return null;
  }
}
