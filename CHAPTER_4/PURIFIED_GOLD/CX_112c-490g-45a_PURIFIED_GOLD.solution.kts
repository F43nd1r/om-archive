
solution {
    puzzle = "P036"
    name = "B CX"
    arm(ARM2) {
        number = 1
        position = -4 to 4
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -6 to 4
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 2 to -1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 1 to -1
        rotation = 2
        size = 1
    }
    arm(ARM3) {
        number = 5
        position = -1 to 1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -3 to 2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 2 to 2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -2 to -1
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 9
        position = 0 to 1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = 1 to 4
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 11
        position = -1 to 6
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 12
        position = -1 to 3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 13
        position = -3 to 3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 14
        position = -4 to 6
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 15
        position = -2 to 4
        rotation = 2
        size = 1
    }
    glyph(PURIFICATION) {
        position = 0 to -1
        rotation = 2
    }
    glyph(PURIFICATION) {
        position = -3 to 1
        rotation = 5
    }
    glyph(PURIFICATION) {
        position = 1 to 1
        rotation = 5
    }
    glyph(PURIFICATION) {
        position = 1 to 2
        rotation = 2
    }
    glyph(PURIFICATION) {
        position = -2 to 2
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -4 to 5
        rotation = 5
    }
    glyph(PURIFICATION) {
        position = -4 to 3
        rotation = 3
    }
    glyph(PURIFICATION) {
        position = 0 to 4
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 6
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -5 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 1 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(5) {
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
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
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
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
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
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
            }
        }
        , 
        {
            sequence(12) {
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(14) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(4)
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(15) {
                wait(10)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
