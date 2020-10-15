
solution {
    puzzle = "P076"
    name = "B CGX 1"
    arm(ARM1) {
        number = 1
        position = 10 to -1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 9 to 0
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 11 to -1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to 5
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 2 to 3
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = 4 to 4
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 7
        position = 1 to 0
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 5 to 3
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = 10 to 1
        rotation = -3
    }
    glyph(PURIFICATION) {
        position = 2 to 5
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 4 to 5
        rotation = 3
    }
    io(INPUT) {
        index = 1
        position = 8 to 1
        rotation = 0
    }
    track {
        position = 0 to 0
        positions = listOf(0 to 0, 1 to 0)
    }
    conduit {
        id = 100
        position = 4 to 3
        rotation = 0
    }
    conduit {
        id = 100
        position = 1 to 1
        rotation = 0
    }
    conduit {
        id = 101
        position = 11 to 0
        rotation = 0
    }
    conduit {
        id = 101
        position = 1 to 4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(7) {
                wait(20)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(12)
                grab()
                rotateClockwise()
                reset()
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(5)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(4)
                repeat()
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(15)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        )
    }
}
