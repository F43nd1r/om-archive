
solution {
    puzzle = "P012"
    name = "B CX 3T"
    arm(ARM1) {
        number = 1
        position = 0 to -3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to -1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 3 to -1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 0 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 2 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 3 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 2 to -2
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 4
    }
    glyph(PROJECTION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to -2
        rotation = 0
    }
    track {
        position = 2 to -1
        positions = listOf(0 to 0, 1 to -1, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                back()
                rotateClockwise()
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
                repeat()
                wait(3)
                repeat()
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
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                back()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
