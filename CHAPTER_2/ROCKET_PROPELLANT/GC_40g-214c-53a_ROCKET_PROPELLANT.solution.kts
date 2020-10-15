
solution {
    puzzle = "P019"
    name = "B GC"
    arm(ARM1) {
        number = 1
        position = 0 to 1
        rotation = 5
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 0
        rotation = 6
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
