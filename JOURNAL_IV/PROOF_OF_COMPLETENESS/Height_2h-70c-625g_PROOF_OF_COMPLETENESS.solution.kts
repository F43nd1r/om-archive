
solution {
    puzzle = "P069"
    name = "H2 6T"
    arm(PISTON) {
        number = 1
        position = 1 to -1
        rotation = -5
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 3 to 0
        rotation = -6
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 2 to 0
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = 7 to -1
        rotation = -9
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 11 to 0
        rotation = -9
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 9 to 0
        rotation = -9
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = -1 to 0
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 8
        position = 0 to -1
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 9
        position = -2 to -1
        rotation = -3
        size = 1
    }
    arm(PISTON) {
        number = 10
        position = -3 to 0
        rotation = -3
        size = 2
    }
    arm(PISTON) {
        number = 11
        position = -6 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 12
        position = -11 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = -9 to 0
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 7 to 0
        rotation = -9
    }
    glyph(BONDER) {
        position = -6 to 0
        rotation = -9
    }
    glyph(CALCIFICATION) {
        position = 8 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -8 to 0
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 5 to -1
        rotation = -9
    }
    glyph(DISPERSION) {
        position = -4 to -1
        rotation = -9
    }
    io(OUTPUT) {
        index = 0
        position = 10 to -1
        rotation = -6
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -8 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 9 to -1
        rotation = -9
    }
    io(OUTPUT) {
        index = 3
        position = -9 to -1
        rotation = -9
    }
    track {
        position = 2 to 0
        positions = listOf(0 to 0, 1 to 0, 1 to -1, 0 to -1, -1 to -1, -2 to -1, -3 to -1, -4 to -1, -5 to 0, -4 to 0, -3 to 0)
    }
    track {
        position = -13 to -1
        positions = listOf(1 to 0, 2 to 0, 2 to 1, 3 to 1, 4 to 1)
    }
    track {
        position = 11 to -1
        positions = listOf(2 to 0, 1 to 0, 0 to 1, -1 to 1, -2 to 1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(8)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
                wait(4)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(5)
                forward()
                wait(3)
                back()
                grab()
                extend()
                extend()
                forward()
                drop()
                retract()
                back()
                retract()
                wait(2)
                grab()
                extend()
                extend()
                forward()
                drop()
                retract()
                back()
                retract()
                wait(2)
                grab()
                extend()
                extend()
                forward()
                drop()
                retract()
                back()
                retract()
                wait(2)
                grab()
                extend()
                extend()
                forward()
                drop()
                retract()
                back()
                retract()
                wait(2)
                grab()
                extend()
                extend()
                forward()
                drop()
                retract()
                back()
                retract()
                wait(2)
                grab()
                extend()
                extend()
                forward()
                drop()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(5)
                forward()
                wait(3)
                back()
                grab()
                extend()
                drop()
                forward()
                retract()
                grab()
                back()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                forward()
                retract()
                grab()
                back()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                forward()
                retract()
                grab()
                back()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                forward()
                retract()
                grab()
                back()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                forward()
                retract()
                grab()
                back()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                forward()
                wait(1)
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(9)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                reset()
                wait(4)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                wait(16)
                grab()
                back()
                back()
                back()
                reset()
                wait(5)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(15)
                grab()
                back()
                back()
                back()
                reset()
                wait(5)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(4)
                grab()
                forward()
                extend()
                extend()
                drop()
                back()
                retract()
                retract()
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                back()
                extend()
                extend()
                reset()
                wait(4)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(9)
                grab()
                forward()
                drop()
                back()
                retract()
                grab()
                extend()
                forward()
                reset()
                wait(1)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                forward()
                wait(2)
                grab()
                extend()
                extend()
                back()
                reset()
                wait(2)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                forward()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                retract()
                back()
                rotateClockwise()
                drop()
                forward()
                reset()
                wait(1)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                grab()
                retract()
                back()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                wait(6)
                grab()
                back()
                back()
                drop()
                forward()
                retract()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(16)
                grab()
                pivotClockwise()
                back()
                back()
                reset()
                wait(5)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(15)
                grab()
                pivotCounterClockwise()
                back()
                back()
                reset()
                wait(5)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
            }
        }
        )
    }
}
