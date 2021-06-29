
solution {
    puzzle = "P071"
    name = "OVERLAP GG"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -2 to 1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to 1
        rotation = 4
        size = 1
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(UNIFICATION) {
        position = 1 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = -1
    }
    track {
        position = 2 to 1
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
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
                pivotClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(13)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        )
    }
}
