
solution {
    puzzle = "P071"
    name = "B GX"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 6 to -5
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 1 to -2
        rotation = 1
        size = 2
    }
    glyph(UNBONDER) {
        position = 3 to -2
        rotation = 6
    }
    glyph(DUPLICATION) {
        position = 5 to -4
        rotation = 2
    }
    glyph(UNIFICATION) {
        position = 3 to -4
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = 1
    }
    track {
        position = 2 to -2
        positions = listOf(0 to 0, -1 to 0, -1 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                back()
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
        , 
        {
            sequence(1) {
                wait(6)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(9)
                rotateCounterClockwise()
                wait(12)
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        )
    }
}
