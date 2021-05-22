
solution {
    puzzle = "P102"
    name = "NO-TRACK"
    arm(ARM3) {
        number = 1
        position = -6 to 5
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -3 to 8
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -4 to 8
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 0 to -1
        rotation = -4
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 3 to -1
        rotation = -4
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = 3 to 6
        rotation = -8
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 4 to -1
        rotation = -4
        size = 3
    }
    arm(PISTON) {
        number = 8
        position = -2 to 6
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 9
        position = 2 to 6
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 1 to -1
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 11
        position = -1 to 1
        rotation = -3
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 3
        rotation = -2
    }
    glyph(BONDER) {
        position = 3 to 3
        rotation = -3
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -2 to 2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -3 to 5
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = -4 to 6
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 0 to 5
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -2 to -1
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 5 to 4
        rotation = -10
    }
    io(OUTPUT) {
        index = 1
        position = 4 to 2
        rotation = -8
    }
    io(INPUT) {
        index = 1
        position = -3 to 2
        rotation = -5
    }
    tape {
        parallel(
        {
            sequence(5) {
        
            }
        }
        , 
        {
            sequence(7) {
                wait(8)
                grab()
                rotateClockwise()
                reset()
                wait(11)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(9)
                grab()
                wait(1)
                rotateCounterClockwise()
                drop()
                grab()
                wait(2)
                rotateCounterClockwise()
                drop()
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                grab()
                extend()
                reset()
                wait(4)
                grab()
                extend()
                reset()
                wait(5)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                grab()
                rotateClockwise()
                wait(5)
                rotateClockwise()
                wait(2)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(11)
                grab()
                extend()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                wait(1)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(11)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
