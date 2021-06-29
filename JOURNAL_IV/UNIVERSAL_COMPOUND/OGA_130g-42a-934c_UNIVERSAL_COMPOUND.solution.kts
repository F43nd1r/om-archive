
solution {
    puzzle = "P072"
    name = "OVERLAP GG"
    arm(ARM1) {
        number = 1
        position = -2 to -2
        rotation = 3
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = -5 to -2
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -4 to -2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -2 to -2
        rotation = 3
    }
    glyph(UNIFICATION) {
        position = -2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = 6
    }
    track {
        position = -2 to -2
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(1)
                rotateCounterClockwise()
                wait(5)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                wait(5)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(7)
                rotateClockwise()
                wait(19)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(62)
                rotateCounterClockwise()
                rotateClockwise()
                wait(18)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(19)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                reset()
                wait(4)
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                reset()
                wait(4)
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                forward()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                reset()
                wait(3)
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                forward()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                rotateClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                back()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
