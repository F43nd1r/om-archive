
solution {
    puzzle = "P074"
    name = "B CIX NOGIF"
    arm(ARM1) {
        number = 1
        position = 2 to -2
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -2 to 3
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -3 to 3
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 2 to 0
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = -4 to 1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 2 to -1
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 7
        position = -3 to 0
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -1 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = -2 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = 0 to 2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = -3 to -1
        rotation = -5
        size = 3
    }
    arm(ARM6) {
        number = 12
        position = 5 to -2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 13
        position = 7 to -2
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = -2 to 2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -3 to 1
        rotation = -6
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = -6
    }
    io(INPUT) {
        index = 0
        position = 0 to 0
        rotation = 1
    }
    track {
        position = 2 to -1
        positions = listOf(-3 to 4, -2 to 3, -1 to 2, 0 to 1, 0 to 0, -1 to 0, -1 to -1)
    }
    track {
        position = -4 to 0
        positions = listOf(0 to 0, 1 to -1, 2 to -2)
    }
    conduit {
        id = 100
        position = -4 to 3
        rotation = -3
    }
    conduit {
        id = 100
        position = 6 to -2
        rotation = 1
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                retract()
                rotateClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                back()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                grab()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(8)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(7)
                back()
                grab()
                pivotCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(5)
                grab()
                back()
                drop()
                wait(2)
                forward()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(8)
                grab()
                rotateClockwise()
                wait(2)
                drop()
            }
        }
        , 
        {
            sequence(13) {
                wait(11)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
