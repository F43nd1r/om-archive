
solution {
    puzzle = "P022"
    name = "NEW SOLUTION 3"
    arm(ARM1) {
        number = 1
        position = 1 to -6
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 5 to -6
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -4 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 6 to -2
        rotation = 3
        size = 3
    }
    arm(ARM3) {
        number = 5
        position = -3 to -1
        rotation = -1
        size = 1
    }
    arm(ARM3) {
        number = 6
        position = 4 to -1
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -4 to 4
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 0 to 4
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -5 to 4
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -5 to 3
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 1 to 4
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 2 to 3
        rotation = 4
        size = 3
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 4 to -3
        rotation = 2
    }
    glyph(PROJECTION) {
        position = -2 to 0
        rotation = -1
    }
    glyph(PROJECTION) {
        position = 2 to 0
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = 2 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 4
        rotation = 0
    }
    track {
        position = -5 to 4
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = 1 to 4
        positions = listOf(0 to 0, 1 to -1, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(1)
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(10) {
                wait(1)
                rotateCounterClockwise()
                forward()
                wait(1)
                forward()
                grab()
                forward()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(3)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(12) {
                wait(3)
                rotateClockwise()
                forward()
                wait(1)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
