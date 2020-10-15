
solution {
    puzzle = "P036"
    name = "B CG"
    arm(ARM6) {
        number = 1
        position = 0 to -2
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 1 to -2
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -5 to 2
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -1 to -4
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 4 to 0
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 2 to 2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 1 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 1 to 0
        rotation = 6
        size = 1
    }
    arm(ARM6) {
        number = 9
        position = 2 to -3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = 4 to -5
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 11
        position = 4 to -3
        rotation = 4
        size = 1
    }
    glyph(PURIFICATION) {
        position = -3 to 2
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 0 to -4
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 0 to 2
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 3 to -1
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = -2 to -1
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 3 to 0
        rotation = 2
    }
    glyph(PURIFICATION) {
        position = 2 to -1
        rotation = 3
    }
    glyph(PURIFICATION) {
        position = 3 to -3
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 0 to -5
        rotation = 0
    }
    track {
        position = 0 to -2
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(1)
                forward()
                grab()
                back()
                drop()
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
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
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
            sequence(5) {
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
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
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
                wait(8)
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
                wait(8)
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
            sequence(9) {
                wait(13)
                grab()
                rotateClockwise()
                drop()
                repeat()
                wait(2)
                repeat()
                wait(3)
                repeat()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(19)
                grab()
                rotateCounterClockwise()
                reset()
                wait(7)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(26)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                reset()
                wait(1)
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
