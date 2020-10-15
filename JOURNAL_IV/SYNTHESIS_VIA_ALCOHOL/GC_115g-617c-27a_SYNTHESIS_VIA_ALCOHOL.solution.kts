
solution {
    puzzle = "P071"
    name = "B GA"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 1 to -2
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -4 to 0
        rotation = 4
        size = 2
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = 6
    }
    glyph(DUPLICATION) {
        position = 0 to -1
        rotation = 2
    }
    glyph(UNIFICATION) {
        position = -2 to -1
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to -2
        rotation = 9
    }
    track {
        position = -3 to 1
        positions = listOf(0 to 0, -1 to 0, -1 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                back()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                forward()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                back()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                back()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                back()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                forward()
                rotateClockwise()
                drop()
                back()
                back()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(37)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        )
    }
}
