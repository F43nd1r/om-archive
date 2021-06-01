
solution {
    puzzle = "w2501728107"
    name = "B CI"
    arm(PISTON) {
        number = 1
        position = 2 to 1
        rotation = 9
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to 3
        rotation = -2
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = -1 to 3
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -3 to 3
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = 0 to 3
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 6 to 1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 3 to 3
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 8
        position = 5 to 3
        rotation = -2
        size = 2
    }
    arm(PISTON) {
        number = 9
        position = 0 to -3
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 10
        position = 2 to -2
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 11
        position = -4 to -1
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 12
        position = -7 to -2
        rotation = 0
        size = 3
    }
    arm(ARM3) {
        number = 13
        position = -6 to -2
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 14
        position = -6 to 3
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 15
        position = -5 to 1
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 16
        position = -5 to 2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 17
        position = -7 to 1
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 18
        position = -8 to 1
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -6 to -1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -3 to 2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to 1
        rotation = 3
    }
    glyph(PURIFICATION) {
        position = 5 to 2
        rotation = 2
    }
    glyph(PURIFICATION) {
        position = -6 to 1
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 1
        rotation = 8
    }
    io(OUTPUT) {
        index = 0
        position = -8 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -1 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 2
        position = 1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -4 to -2
        rotation = 2
    }
    track {
        position = 6 to 1
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = -2 to 3
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = 0 to -3
        positions = listOf(0 to 0, -1 to 1)
    }
    conduit {
        id = 100
        position = -7 to -1
        rotation = 0
    }
    conduit {
        id = 100
        position = -7 to 3
        rotation = 0
    }
    conduit {
        id = 101
        position = 0 to 0
        rotation = 5
    }
    conduit {
        id = 101
        position = 5 to 1
        rotation = 3
    }
    conduit {
        id = 102
        position = 3 to -1
        rotation = 9
    }
    conduit {
        id = 102
        position = -9 to 3
        rotation = 18
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(4)
                extendTape()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                extend()
                reset()
                wait(5)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(9)
                grab()
                retract()
                rotateClockwise()
                reset()
                wait(4)
                grab()
                retract()
                reset()
                wait(5)
                grab()
                retract()
                rotateClockwise()
                reset()
                wait(4)
                grab()
                retract()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(20)
                grab()
                rotateCounterClockwise()
                reset()
                wait(13)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                grab()
                rotateClockwise()
                extend()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                extend()
                wait(1)
                retract()
                pivotClockwise()
                wait(3)
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                wait(4)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                grab()
                extend()
                extend()
                drop()
                retract()
                wait(2)
                grab()
                extend()
                drop()
                retract()
                wait(2)
                grab()
                extend()
                drop()
                retract()
                wait(2)
                grab()
                extend()
                drop()
                retract()
                wait(2)
                grab()
                extend()
                drop()
                retract()
                wait(2)
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                wait(2)
                grab()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(15) {
                wait(4)
                grab()
                retract()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                retract()
                reset()
                wait(3)
                grab()
                retract()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                retract()
                reset()
                wait(3)
                grab()
                retract()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                retract()
                drop()
            }
        }
        , 
        {
            sequence(16) {
                wait(13)
                grab()
                extend()
                reset()
                wait(9)
                grab()
                extend()
                reset()
                wait(9)
                grab()
                extend()
                reset()
                wait(7)
                grab()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(12) {
                grab()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(4)
                repeat()
                wait(11)
                repeat()
                wait(9)
                grab()
                retract()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(17)
                grab()
                retract()
                forward()
                drop()
                extend()
                wait(6)
                grab()
                back()
                reset()
                wait(2)
                grab()
                retract()
                forward()
                drop()
                extend()
                wait(1)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(7)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                extend()
                extend()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                extend()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(7)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(18) {
                wait(27)
                grab()
                wait(5)
                drop()
                grab()
                retract()
                reset()
                wait(8)
                grab()
                retract()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                extend()
                pivotCounterClockwise()
                extend()
                reset()
                wait(3)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(8)
                grab()
                pivotClockwise()
                extend()
                extend()
                wait(1)
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(17) {
                wait(10)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(8)
                grab()
                rotateClockwise()
                reset()
                wait(9)
                grab()
                rotateClockwise()
                reset()
                wait(7)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(9)
                grab()
                forward()
                reset()
                wait(5)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                retract()
                rotateCounterClockwise()
                reset()
                wait(8)
                grab()
                rotateClockwise()
                extend()
                reset()
                wait(5)
                grab()
                retract()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                extend()
                wait(1)
                back()
                pivotClockwise()
                retract()
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
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                wait(1)
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                drop()
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                wait(1)
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                wait(1)
                drop()
            }
        }
        )
    }
}
