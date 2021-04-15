
solution {
    puzzle = "P071"
    name = "B GA"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 4 to -2
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to 1
        rotation = 3
        size = 2
    }
    glyph(UNBONDER) {
        position = 1 to 1
        rotation = 6
    }
    glyph(DUPLICATION) {
        position = 3 to -1
        rotation = 2
    }
    glyph(UNIFICATION) {
        position = 1 to -1
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 0
        rotation = 8
    }
    track {
        position = 0 to 1
        positions = listOf(0 to 0, -1 to 0, -1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(31)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                grab()
                rotateClockwise()
                pivotClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                back()
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                rotateClockwise()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
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
                rotateCounterClockwise()
                forward()
                grab()
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
                drop()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                back()
                grab()
                forward()
                rotateClockwise()
                back()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                back()
                reset()
            }
        }
        )
    }
}
