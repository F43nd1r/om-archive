
solution {
    puzzle = "P100"
    name = "OAG"
    arm(ARM1) {
        number = 1
        position = -1 to 1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 5
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to 1
        rotation = 9
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to 0
        rotation = 7
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 1
        rotation = 4
    }
    track {
        position = 0 to 1
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
