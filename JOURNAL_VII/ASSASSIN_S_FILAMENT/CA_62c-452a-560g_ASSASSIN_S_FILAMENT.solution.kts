
solution {
    puzzle = "P097"
    name = "B CA 2T"
    arm(ARM1) {
        number = 1
        position = 1 to -3
        rotation = 5
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -1 to 2
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = 1 to 1
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = -1 to -3
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = -1 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 0 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 5 to -4
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 8
        position = 7 to -5
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 9
        position = 7 to -9
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 10
        position = 7 to -10
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = 6 to -8
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 12
        position = 7 to -4
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 4 to -2
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 5 to -5
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 7 to -7
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 7 to -8
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to -4
        rotation = 0
    }
    track {
        position = -1 to 3
        positions = listOf(1 to -2, 2 to -2, 1 to -1, 0 to -1)
    }
    track {
        position = 7 to -3
        positions = listOf(0 to -1, 0 to -2, -1 to -1, -2 to -1, -2 to 0, -2 to 1, -3 to 1, -3 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(8)
                grab()
                rotateClockwise()
                reset()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                extend()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(8)
                grab()
                rotateCounterClockwise()
                reset()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                wait(8)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                extend()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                pivotClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                retract()
                pivotCounterClockwise()
                drop()
                back()
                extend()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                wait(6)
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(10)
                back()
                back()
                grab()
                retract()
                pivotCounterClockwise()
                drop()
                back()
                extend()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                retract()
                pivotClockwise()
                drop()
                forward()
                extend()
                wait(2)
                back()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(1)
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                wait(10)
                back()
                wait(1)
                forward()
                forward()
                grab()
                back()
                pivotCounterClockwise()
                reset()
                wait(2)
                repeat()
            }
        }
        )
    }
}
