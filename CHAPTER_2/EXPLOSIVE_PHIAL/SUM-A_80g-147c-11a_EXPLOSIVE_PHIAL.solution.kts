
solution {
    puzzle = "P017"
    name = "B AA"
    arm(PISTON) {
        number = 1
        position = -1 to -1
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                extend()
                reset()
            }
        }
        )
    }
}
