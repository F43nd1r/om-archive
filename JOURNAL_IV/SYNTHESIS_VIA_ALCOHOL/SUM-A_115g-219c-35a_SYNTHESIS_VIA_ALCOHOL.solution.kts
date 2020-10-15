
solution {
    puzzle = "P071"
    name = "B GC"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -6 to 0
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 2
        rotation = -1
        size = 2
    }
    glyph(UNBONDER) {
        position = -3 to 0
        rotation = 4
    }
    glyph(DUPLICATION) {
        position = -5 to 0
        rotation = -1
    }
    glyph(UNIFICATION) {
        position = -5 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -5 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = 1
    }
    track {
        position = -3 to 1
        positions = listOf(0 to 0, 0 to 1, -1 to 2)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(8)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(17)
                rotateCounterClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                back()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
