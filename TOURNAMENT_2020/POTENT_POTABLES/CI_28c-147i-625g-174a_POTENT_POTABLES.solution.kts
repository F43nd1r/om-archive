
solution {
    puzzle = "w2501727721"
    name = "B CI 3T"
    arm(ARM6) {
        number = 1
        position = 1 to 5
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 6 to 0
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = 4 to 0
        rotation = 0
        size = 2
    }
    arm(ARM3) {
        number = 4
        position = 0 to 5
        rotation = 5
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = 8 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 7 to 2
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = -2 to 3
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 8
        position = -1 to 2
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 9
        position = -1 to 3
        rotation = -6
        size = 3
    }
    arm(PISTON) {
        number = 10
        position = -2 to 4
        rotation = -6
        size = 3
    }
    arm(PISTON) {
        number = 11
        position = -2 to 5
        rotation = -6
        size = 3
    }
    arm(PISTON) {
        number = 12
        position = -2 to 6
        rotation = -6
        size = 3
    }
    arm(ARM6) {
        number = 13
        position = 2 to -1
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 14
        position = 1 to -1
        rotation = 1
        size = 2
    }
    glyph(MULTI_BONDER) {
        position = 5 to 4
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to 3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 0 to 3
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 2
        rotation = 1
    }
    io(OUTPUT) {
        index = 1
        position = 1 to 8
        rotation = 0
    }
    track {
        position = 5 to -1
        positions = listOf(0 to 0, -1 to 1)
    }
    track {
        position = -2 to 3
        positions = listOf(-1 to 2, -1 to 1, -1 to 0, 0 to -1, 0 to 0, 1 to -1, 1 to 0, 0 to 1, 0 to 2, 0 to 3, -1 to 3)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                repeat()
                wait(3)
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
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                pivotCounterClockwise()
                drop()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                retract()
                rotateClockwise()
                back()
                drop()
                wait(1)
                back()
                back()
                back()
            }
        }
        , 
        {
            sequence(8) {
                wait(5)
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                retract()
                rotateClockwise()
                back()
                drop()
                wait(1)
                back()
                back()
            }
        }
        , 
        {
            sequence(9) {
                wait(8)
                back()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                retract()
                rotateClockwise()
                back()
                drop()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(10) {
                wait(11)
                back()
                back()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                retract()
                rotateClockwise()
                back()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(14)
                back()
                back()
                back()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                retract()
                rotateClockwise()
                back()
                drop()
            }
        }
        , 
        {
            sequence(12) {
                wait(17)
                back()
                back()
                back()
                back()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(13) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(14) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
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
                rotateCounterClockwise()
                drop()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        )
    }
}
