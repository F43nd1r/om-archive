
solution {
    puzzle = "P066"
    name = "B CA 3T"
    arm(ARM1) {
        number = 1
        position = -2 to 1
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -4 to 1
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = -4 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -4 to 3
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -4 to 2
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -3 to 3
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -3 to 4
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -1 to 4
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 9
        position = -2 to 5
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 10
        position = 5 to 0
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 11
        position = 4 to 0
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 12
        position = 3 to 1
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 13
        position = 4 to -1
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 3
    }
    glyph(BONDER) {
        position = -1 to 3
        rotation = 3
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 3
    }
    glyph(MULTI_BONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -5
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -3
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -2 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 3 to 0
        rotation = 0
    }
    track {
        position = -4 to 2
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
    }
    track {
        position = -3 to 1
        positions = listOf(1 to 0, 0 to 0, 0 to -1, -1 to 0)
    }
    track {
        position = 2 to 3
        positions = listOf(1 to -1, 1 to -2, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(7) {
                grab()
                rotateClockwise()
                reset()
                wait(7)
                repeat()
                wait(3)
                repeat()
                wait(7)
                repeat()
                wait(3)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                pivotClockwise()
                extend()
                drop()
                retract()
                grab()
                pivotClockwise()
                reset()
                wait(3)
                grab()
                extend()
                pivotClockwise()
                extend()
                drop()
                retract()
                grab()
                pivotClockwise()
                reset()
                wait(3)
                grab()
                extend()
                pivotClockwise()
                extend()
                drop()
                retract()
                grab()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                grab()
                extend()
                reset()
                wait(5)
                grab()
                extend()
                pivotClockwise()
                reset()
                wait(4)
                grab()
                extend()
                pivotClockwise()
                extend()
                drop()
                retract()
                grab()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                pivotClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(4)
                grab()
                rotateClockwise()
                pivotClockwise()
                forward()
                reset()
                wait(3)
                grab()
                back()
                back()
                drop()
                back()
                wait(3)
                grab()
                forward()
                drop()
                back()
                grab()
                back()
                rotateClockwise()
                extend()
                extend()
                forward()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                grab()
                forward()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(2)
                grab()
                extend()
                pivotCounterClockwise()
                reset()
                wait(8)
                repeat()
                wait(13)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                pivotCounterClockwise()
                reset()
                wait(9)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                wait(10)
                grab()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                wait(15)
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(7)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(4)
                back()
                grab()
                forward()
                pivotClockwise()
                drop()
                forward()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                reset()
                wait(3)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                extend()
                wait(1)
                pivotCounterClockwise()
                reset()
                wait(6)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                extend()
                wait(1)
                pivotCounterClockwise()
                reset()
                wait(6)
                grab()
                rotateClockwise()
                extend()
                wait(1)
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(6)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                wait(2)
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                wait(2)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                extend()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                forward()
                pivotClockwise()
                drop()
                forward()
                forward()
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                wait(2)
                rotateClockwise()
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                reset()
                wait(2)
                grab()
                forward()
                pivotClockwise()
                drop()
                forward()
                forward()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                reset()
                wait(5)
                repeat()
                wait(11)
                repeat()
            }
        }
        )
    }
}
