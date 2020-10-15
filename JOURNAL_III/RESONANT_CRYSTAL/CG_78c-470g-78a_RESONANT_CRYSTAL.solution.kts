
solution {
    puzzle = "P066"
    name = "B CG 3T"
    arm(ARM1) {
        number = 1
        position = -1 to 2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -5 to 1
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -4 to 1
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -3 to 4
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -3 to 3
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -2 to 4
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -2 to 5
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 0 to 5
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = -1 to 8
        rotation = 4
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 4 to 0
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 11
        position = 4 to 2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 12
        position = 7 to -2
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 6 to -2
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to 2
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = 0 to 3
        rotation = 3
    }
    glyph(BONDER) {
        position = 0 to 4
        rotation = 3
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 3
    }
    glyph(MULTI_BONDER) {
        position = 1 to 2
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -3
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 4 to 1
        rotation = 0
    }
    track {
        position = 7 to -2
        positions = listOf(-2 to 2, -1 to 1, 0 to 0, -1 to 0)
    }
    track {
        position = -3 to 0
        positions = listOf(0 to 0, -1 to 1, -2 to 1, -1 to 0)
    }
    track {
        position = -2 to 2
        positions = listOf(1 to 0, 0 to 0, -1 to 0)
    }
    track {
        position = -3 to 3
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
    }
    track {
        position = -1 to 6
        positions = listOf(0 to 0, 0 to 1, 0 to 2)
    }
    track {
        position = 3 to 4
        positions = listOf(1 to -1, 1 to -2, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                forward()
                reset()
                wait(3)
                grab()
                back()
                back()
                pivotCounterClockwise()
                drop()
                back()
                wait(3)
                back()
                grab()
                forward()
                reset()
                wait(1)
                grab()
                back()
                back()
                pivotCounterClockwise()
                drop()
                forward()
                wait(1)
                forward()
                grab()
                back()
                back()
                pivotCounterClockwise()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                forward()
                grab()
                back()
                back()
                pivotCounterClockwise()
                drop()
                back()
                back()
                wait(3)
                grab()
                rotateClockwise()
                back()
                rotateCounterClockwise()
                wait(1)
                back()
                pivotCounterClockwise()
                drop()
                back()
                back()
                wait(4)
                grab()
                forward()
                drop()
                back()
                wait(2)
                grab()
                back()
                back()
                pivotCounterClockwise()
                reset()
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
                back()
                reset()
                wait(1)
                grab()
                back()
                pivotClockwise()
                back()
                drop()
                forward()
                grab()
                pivotClockwise()
                reset()
                wait(3)
                grab()
                back()
                pivotClockwise()
                back()
                drop()
                forward()
                grab()
                pivotClockwise()
                reset()
                wait(3)
                grab()
                back()
                pivotClockwise()
                back()
                drop()
                forward()
                grab()
                pivotClockwise()
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
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
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
            sequence(5) {
                wait(7)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                reset()
                back()
                back()
                wait(2)
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
            sequence(13) {
                wait(5)
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                wait(2)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                wait(2)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                pivotCounterClockwise()
                drop()
                back()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(12) {
                grab()
                back()
                drop()
                wait(4)
                forward()
                grab()
                back()
                pivotClockwise()
                reset()
                wait(4)
                grab()
                back()
                pivotClockwise()
                back()
                drop()
                forward()
                grab()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                pivotClockwise()
                back()
                drop()
                forward()
                wait(1)
                reset()
            }
        }
        , 
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
            sequence(6) {
                wait(6)
                grab()
                pivotCounterClockwise()
                reset()
                wait(9)
                grab()
                pivotCounterClockwise()
                drop()
                wait(9)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
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
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                forward()
                forward()
                rotateClockwise()
                wait(8)
                back()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                wait(14)
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(8)
                repeat()
                wait(13)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
