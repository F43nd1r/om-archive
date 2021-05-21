
solution {
    puzzle = "P097"
    name = "NO-TRACK"
    arm(ARM6) {
        number = 1
        position = -15 to 10
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -16 to 12
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = -12 to 10
        rotation = -1
        size = 1
    }
    arm(ARM2) {
        number = 4
        position = -9 to 5
        rotation = -5
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -7 to 11
        rotation = -4
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -8 to 4
        rotation = -8
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -4 to -3
        rotation = -5
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = -3 to -3
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 6 to -4
        rotation = -4
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = -2 to 6
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = -1 to 3
        rotation = -3
        size = 3
    }
    glyph(BONDER) {
        position = -12 to 9
        rotation = 4
    }
    glyph(BONDER) {
        position = -7 to 8
        rotation = -3
    }
    glyph(BONDER) {
        position = -5 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = 6 to -1
        rotation = -3
    }
    glyph(BONDER) {
        position = -14 to 10
        rotation = -1
    }
    io(INFINITE) {
        index = 0
        position = 8 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -15 to 11
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -13 to 10
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -4 to 8
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(1)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(3)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(1)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(8)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
