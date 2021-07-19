
solution {
    puzzle = "w1698789743"
    name = "B CI65"
    arm(ARM3) {
        number = 1
        position = -1 to -2
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -2 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 0 to 1
        rotation = -2
        size = 2
    }
    arm(ARM6) {
        number = 4
        position = 0 to -3
        rotation = 1
        size = 1
    }
    arm(ARM3) {
        number = 5
        position = 1 to 0
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 4 to -1
        rotation = 3
        size = 2
    }
    arm(ARM6) {
        number = 7
        position = 2 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 4 to -6
        rotation = -4
        size = 2
    }
    arm(ARM6) {
        number = 9
        position = 4 to -2
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 10
        position = 3 to -3
        rotation = -4
        size = 2
    }
    arm(ARM3) {
        number = 11
        position = 5 to -2
        rotation = -4
        size = 2
    }
    arm(ARM6) {
        number = 12
        position = 0 to 2
        rotation = -2
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = 4 to -3
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = -8
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = -5
    }
    glyph(CALCIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 1 to -3
        rotation = -8
    }
    glyph(ANIMISMUS) {
        position = 2 to 1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = -4
    }
    io(OUTPUT) {
        index = 0
        position = 6 to -4
        rotation = 1
    }
    io(OUTPUT) {
        index = 1
        position = 1 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
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
            sequence(10) {
                wait(8)
                grab()
                retract()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
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
            }
        }
        , 
        {
            sequence(3) {
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
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
                wait(1)
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
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(10)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(12) {
                wait(9)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(10)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(8)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
