package dev.blachut.svelte.lang.parsing.html.psi

import com.intellij.lang.ASTNode
import com.intellij.lang.javascript.psi.JSElement
import dev.blachut.svelte.lang.psi.SveltePsiElementImpl
import dev.blachut.svelte.lang.psi.SvelteTag

abstract class SvelteBlock(node: ASTNode) : SveltePsiElementImpl(node), JSElement {
    val startTag: SvelteTag get() = primaryBranch.tag
    val endTag: SvelteTag? get() = lastChild as? SvelteTag

    val primaryBranch get() = firstChild as SveltePrimaryBranch
}