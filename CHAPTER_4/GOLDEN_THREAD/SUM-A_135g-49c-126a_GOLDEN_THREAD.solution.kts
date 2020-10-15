
solution {
    puzzle = "P037"
    name = "B CG 6T"
    arm(ARM1) {
        number = 1
        position = 3 to 2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 2 to 3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 3 to 1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -1 to 2
        rotation = 0
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 1 to 2
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 4 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -11 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 4
        rotation = 0
    }
    track {
        position = -3 to 3
        positions = listOf(0 to 0, 1 to 0, 2 to -1)
    }
    track {
        position = 2 to 2
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                reset()
                wait(3)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                back()
                back()
                wait(3)
                rotateClockwise()
                forward()
                wait(1)
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                wait(1)
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                wait(1)
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                wait(1)
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                wait(1)
                pivotCounterClockwise()
                back()
                wait(2)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
