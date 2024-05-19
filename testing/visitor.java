@SuppressWarnings("CheckReturnValue")
public class visitor extends AGLBaseVisitor<String> {

   @Override public String visitProgram(AGLParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitStatement(AGLParser.StatementContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitVarDeclaration(AGLParser.VarDeclarationContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitObjectDeclaration(AGLParser.ObjectDeclarationContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitObjectProperty(AGLParser.ObjectPropertyContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitObjectType(AGLParser.ObjectTypeContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitViewDeclaration(AGLParser.ViewDeclarationContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitViewProperty(AGLParser.ViewPropertyContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitViewAction(AGLParser.ViewActionContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitPrint(AGLParser.PrintContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAssignment(AGLParser.AssignmentContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitAction(AGLParser.ActionContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitComment(AGLParser.CommentContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitType(AGLParser.TypeContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitExpr(AGLParser.ExprContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitPoint(AGLParser.PointContext ctx) {
      String res = null;
      return visitChildren(ctx);
      //return res;
   }
}
