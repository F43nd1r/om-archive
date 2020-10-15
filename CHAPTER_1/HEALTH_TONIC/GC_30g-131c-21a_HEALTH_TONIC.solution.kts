
solution {
    puzzle = "P014"
    name = "B GCX"
    arm(ARM1) {
        number = 1
        position = -2 to 2
        rotation = 6
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = 5
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 6
    }
    io(INPUT) {
        index = 0
        position = -3 to 3
        rotation = 4
    }
    io(INPUT) {
        index = 1
        position = -1 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
