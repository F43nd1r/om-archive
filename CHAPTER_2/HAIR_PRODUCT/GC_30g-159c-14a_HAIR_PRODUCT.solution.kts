
solution {
    puzzle = "P016"
    name = "B GC"
    arm(ARM1) {
        number = 1
        position = 0 to 1
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
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
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
