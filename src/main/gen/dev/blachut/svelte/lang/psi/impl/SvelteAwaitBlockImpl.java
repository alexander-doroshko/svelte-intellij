// This is a generated file. Not intended for manual editing.
package dev.blachut.svelte.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static dev.blachut.svelte.lang.psi.SvelteTypes.*;
import dev.blachut.svelte.lang.psi.*;

public class SvelteAwaitBlockImpl extends SvelteBlockImpl implements SvelteAwaitBlock {

  public SvelteAwaitBlockImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SvelteVisitor visitor) {
    visitor.visitAwaitBlock(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SvelteVisitor) accept((SvelteVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SvelteAwaitBlockClosingTag getAwaitBlockClosingTag() {
    return findChildByClass(SvelteAwaitBlockClosingTag.class);
  }

  @Override
  @Nullable
  public SvelteAwaitBlockOpening getAwaitBlockOpening() {
    return findChildByClass(SvelteAwaitBlockOpening.class);
  }

  @Override
  @Nullable
  public SvelteAwaitThenBlockOpening getAwaitThenBlockOpening() {
    return findChildByClass(SvelteAwaitThenBlockOpening.class);
  }

  @Override
  @Nullable
  public SvelteCatchContinuation getCatchContinuation() {
    return findChildByClass(SvelteCatchContinuation.class);
  }

  @Override
  @Nullable
  public SvelteThenContinuation getThenContinuation() {
    return findChildByClass(SvelteThenContinuation.class);
  }

}
