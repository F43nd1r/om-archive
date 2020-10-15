
solution {
    puzzle = "P063"
    name = "B CA 2T"
    arm(PISTON) {
        number = 1
        position = -4 to 2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -3 to 2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -4 to 1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -1 to 3
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = -4 to 4
        rotation = 5
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -3 to 5
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = -3 to 4
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -1 to 4
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 0 to 4
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = 1 to 3
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = -1 to 5
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = -4 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 13
        position = -3 to -3
        rotation = 1
        size = 3
    }
    arm(PISTON) {
        number = 14
        position = 0 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 15
        position = -4 to 3
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 16
        position = -1 to -3
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 17
        position = -1 to -2
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 18
        position = 3 to -5
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 19
        position = 2 to -3
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -4
        rotation = 2
    }
    glyph(MULTI_BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 5 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to 3
        rotation = 0
    }
    track {
        position = 3 to -5
        positions = listOf(-1 to 1, 0 to 0, 0 to 1, -1 to 2)
    }
    track {
        position = -2 to 4
        positions = listOf(-1 to 1, 0 to 0, -1 to 0)
    }
    track {
        position = 2 to 1
        positions = listOf(0 to 0, -1 to 1, -2 to 2, -3 to 3, -3 to 4, -2 to 3, -1 to 2, 0 to 1)
    }
    track {
        position = -4 to 1
        positions = listOf(3 to -3, 2 to -3, 2 to -2, 1 to -1, 0 to 0, 1 to 0, 1 to 1, 0 to 1, -1 to 1, -2 to 1)
    }
    track {
        position = -4 to -2
        positions = listOf(0 to -1, 1 to -1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(19) {
                wait(6)
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                wait(1)
                back()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                extend()
                extend()
                reset()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                back()
                drop()
                retract()
                back()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(12) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                wait(2)
                rotateClockwise()
                wait(5)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(3)
                forward()
                grab()
                rotateClockwise()
                back()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(15) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(17) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(5)
                forward()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(18) {
                wait(6)
                grab()
                pivotClockwise()
                pivotClockwise()
                extend()
                wait(2)
                pivotCounterClockwise()
                drop()
                back()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(4)
                grab()
                back()
                drop()
                back()
                rotateClockwise()
                wait(1)
                grab()
                back()
                drop()
                back()
                back()
                rotateCounterClockwise()
                back()
                wait(4)
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(9)
                back()
                back()
                wait(5)
                grab()
                back()
                drop()
                back()
                rotateClockwise()
                wait(1)
                grab()
                back()
                drop()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(9)
                back()
                back()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                wait(2)
                grab()
                back()
                back()
                wait(1)
                pivotCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                wait(4)
                reset()
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                back()
                back()
                forward()
                forward()
                back()
                grab()
                back()
                drop()
                back()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(8)
                grab()
                back()
                back()
                wait(1)
                pivotCounterClockwise()
                back()
                drop()
                back()
                back()
                back()
                wait(3)
                back()
                back()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                back()
                grab()
                back()
                extend()
                reset()
                wait(7)
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
                grab()
                rotateCounterClockwise()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(16) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(5)
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
                back()
                drop()
                retract()
                forward()
                forward()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                back()
                drop()
                rotateClockwise()
                forward()
                forward()
                wait(4)
                grab()
                rotateCounterClockwise()
                extend()
                back()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(3)
                grab()
                retract()
                retract()
                rotateClockwise()
                extend()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                rotateClockwise()
                retract()
                retract()
                rotateClockwise()
                wait(1)
                extend()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
