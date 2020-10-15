
solution {
    puzzle = "P022"
    name = "B CX 4T"
    arm(ARM1) {
        number = 1
        position = 2 to -5
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 3 to -1
        rotation = 3
        size = 3
    }
    arm(ARM3) {
        number = 3
        position = 1 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -2 to 5
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -2 to 4
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -3 to 5
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -2 to -5
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -7 to -1
        rotation = 0
        size = 3
    }
    arm(ARM3) {
        number = 9
        position = -6 to 0
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = -8 to 5
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = -7 to 4
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = -7 to 5
        rotation = 4
        size = 3
    }
    glyph(BONDER) {
        position = -7 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = -1
    }
    glyph(PROJECTION) {
        position = -1 to 1
        rotation = -2
    }
    glyph(PROJECTION) {
        position = -5 to 1
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -5 to 5
        rotation = 0
    }
    track {
        position = -9 to 6
        positions = listOf(1 to -1, 2 to -2, 1 to -2)
    }
    track {
        position = -3 to 7
        positions = listOf(1 to -2, 1 to -3, 2 to -3)
    }
    tape {
        parallel(
        {
            sequence(12) {
                wait(6)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
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
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
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
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                back()
                rotateClockwise()
                back()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(3)
                grab()
                rotateClockwise()
                back()
                drop()
                back()
                rotateCounterClockwise()
                back()
            }
        }
        , 
        {
            sequence(11) {
                wait(6)
                back()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                back()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                back()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                back()
            }
        }
        )
    }
}
