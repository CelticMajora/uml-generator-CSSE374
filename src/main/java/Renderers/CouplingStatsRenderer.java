package Renderers;

import Containers.ArrowContainer;
import Containers.AssociationArrowContainer;
import Containers.ClassContainer;
import Containers.DependencyArrowContainer;
import Containers.DoubleAssociationArrowContainer;
import Containers.DoubleDependencyArrowContainer;
import Containers.FakeMethodContainer;
import Containers.FieldContainer;
import Containers.ImplementationArrowContainer;
import Containers.InheritanceArrowContainer;
import Containers.MethodContainer;
import Containers.ParameterContainer;
import Containers.ProgramContainer;
import Containers.RealMethodContainer;
import Containers.SkinParamContainer;

public class CouplingStatsRenderer implements Renderer {

	@Override
	public String render(ProgramContainer programContainer) {
		StringBuilder stringBuilder = new StringBuilder();
		programContainer.classes.forEach((ClassContainer classContainer) -> {
			stringBuilder.append(this.renderClassContainer(classContainer));
			stringBuilder.append('\n');
		});
		return stringBuilder.toString();
	}

	@Override
	public String renderClassContainer(ClassContainer classContainer) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(String.format("%s:\n", classContainer.classNodeWrapper.name));
		stringBuilder.append(String.format("Outward Dependency Count: %d\n", classContainer.dependencies.size()));
		stringBuilder.append(String.format("Outward Association Count: %d\n", classContainer.associations.size()));
		stringBuilder.append(String.format("Inward Dependency Count: %d\n", classContainer.classesThatDependOnThis.size()));
		stringBuilder.append(String.format("Inward Association Count: %d\n\n", classContainer.classesThatAssociateWithThis.size()));
		return stringBuilder.toString();
	}

	@Override
	public String renderFieldContainer(FieldContainer fieldContainer) {
		return "";
	}

	@Override
	public String renderMethodContainer(MethodContainer methodContainer) {
		return "";
	}

	@Override
	public String renderParameterContainer(ParameterContainer parameterContainer) {
		return "";
	}

	@Override
	public String renderArrowContainer(ArrowContainer arrowContainer) {
		return "";
	}

	@Override
	public String renderSkinParamContainer(SkinParamContainer skinParamContainer) {
		return "";
	}

	@Override
	public String renderDependencyArrowContainer(DependencyArrowContainer dependencyArrowContainer) {
		return "";
	}

	@Override
	public String renderAssociationArrowContainer(AssociationArrowContainer associationArrowContainer) {
		return "";
	}

	@Override
	public String renderInheritanceArrowContainer(InheritanceArrowContainer inheritanceArrowContainer) {
		return "";
	}

	@Override
	public String renderImplementationArrowContainer(ImplementationArrowContainer implementationArrowContainer) {
		return "";
	}

	@Override
	public String renderDoubleDependencyArrowContainer(DoubleDependencyArrowContainer doubleDependencyARrowContainer) {
		return "";
	}

	@Override
	public String renderDoubleAssociationArrowContainer(
			DoubleAssociationArrowContainer doubleAssociationARrowContainer) {
		return "";
	}

	@Override
	public String renderRealMethodContainer(RealMethodContainer realMethodContainer) {
		return "";
	}

	@Override
	public String renderFakeMethodContainer(FakeMethodContainer fakeMethodContainer) {
		return "";
	}

}
