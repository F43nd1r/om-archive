
solution {
    puzzle = "P062"
    name = "B X S 6T"
    arm(ARM1) {
        number = 1
        position = -5 to 0
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -7 to 1
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -6 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -7 to 2
        rotation = 5
        size = 3
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -6 to 0
        rotation = 1
    }
    io(INFINITE) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -7 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -5 to -1
        rotation = 0
    }
    track {
        position = -7 to 2
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(4)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateClockwise()
                reset()
                wait(1)
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                wait(1)
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(8)
                grab()
                pivotClockwise()
                forward()
                forward()
                reset()
                wait(5)
                grab()
                pivotClockwise()
                forward()
                forward()
                reset()
                wait(5)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(19)
                repeat()
                wait(17)
                grab()
                pivotClockwise()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
