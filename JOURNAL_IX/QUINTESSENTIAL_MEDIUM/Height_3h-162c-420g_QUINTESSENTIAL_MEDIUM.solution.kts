
solution {
    puzzle = "P107"
    name = "H3 6T"
    arm(ARM1) {
        number = 1
        position = -5 to 0
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -4 to 0
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -4 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -6 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -7 to -1
        rotation = 5
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 1 to 0
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = 2 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 3 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = 4 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = 6 to 0
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -4 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 7 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -8 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 10 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -1
        rotation = -1
    }
    track {
        position = 2 to 0
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -6 to -2
        positions = listOf(-3 to 1, -2 to 1, -1 to 1, 0 to 0, 0 to 1, 1 to 1, 2 to 1, 2 to 2, 1 to 2, 0 to 2, -1 to 2)
    }
    track {
        position = 7 to -2
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -3 to 0, -4 to 0, -5 to 0, -6 to 0)
    }
    track {
        position = 7 to 0
        positions = listOf(1 to 0, 0 to 0, -1 to 0, -2 to 0)
    }
    tape {
        parallel(
        {
            sequence(8) {
                wait(13)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                wait(1)
                reset()
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                rotateClockwise()
                back()
                wait(5)
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(17)
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                back()
                back()
                reset()
                wait(6)
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                back()
                wait(10)
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(7)
                back()
                grab()
                forward()
                wait(4)
                forward()
                forward()
                reset()
                wait(3)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                back()
                grab()
                forward()
                forward()
                forward()
                reset()
                wait(5)
                back()
                grab()
                forward()
                wait(9)
                grab()
                forward()
                forward()
                reset()
                wait(2)
                grab()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(6)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                grab()
                back()
                reset()
                wait(3)
                grab()
                back()
                reset()
                wait(4)
                grab()
                back()
                reset()
                wait(1)
                grab()
                forward()
                wait(1)
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(16)
                grab()
                back()
                back()
                drop()
                forward()
                grab()
                back()
                reset()
                wait(5)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                grab()
                back()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                wait(15)
                grab()
                back()
                reset()
                wait(5)
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                reset()
                wait(6)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                grab()
                rotateClockwise()
                back()
                reset()
                wait(10)
                grab()
                back()
                drop()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(13)
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                wait(4)
                reset()
                wait(3)
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                wait(6)
                reset()
                wait(1)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                extend()
                wait(3)
                grab()
                retract()
                back()
                pivotCounterClockwise()
                back()
                back()
                pivotClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                back()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                reset()
                wait(2)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                repeat()
                wait(12)
                back()
                wait(6)
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(10)
                grab()
                retract()
                back()
                drop()
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                retract()
                back()
                drop()
                wait(2)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                grab()
                retract()
                back()
                drop()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                retract()
                wait(3)
                back()
                grab()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(24)
                forward()
                grab()
                back()
                pivotClockwise()
                wait(5)
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                back()
                back()
                reset()
                wait(9)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
                wait(25)
                repeat()
            }
        }
        )
    }
}
