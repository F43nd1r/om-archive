
solution {
    puzzle = "P095"
    name = "B F"
    arm(ARM6) {
        number = 1
        position = 0 to 3
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = 1 to 2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -4 to 5
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -5 to 5
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -5 to 7
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -3 to 5
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 1 to 5
        rotation = 4
    }
    glyph(PROJECTION) {
        position = 3 to 3
        rotation = 3
    }
    glyph(PROJECTION) {
        position = -1 to 5
        rotation = 4
    }
    glyph(PROJECTION) {
        position = 1 to 1
        rotation = 6
    }
    glyph(PROJECTION) {
        position = 3 to 1
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -2 to 3
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -1
        rotation = 7
    }
    track {
        position = -5 to 6
        positions = listOf(-1 to 1, 0 to 0, 1 to -1)
    }
    track {
        position = -6 to 6
        positions = listOf(-1 to 1, 0 to 0, 1 to -1)
    }
    track {
        position = 1 to 2
        positions = listOf(0 to 0, 0 to 1, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                back()
                back()
                reset()
                wait(2)
                repeat()
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                back()
                back()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                repeat()
                wait(2)
                repeat()
                wait(2)
                repeat()
                wait(3)
                grab()
                rotateClockwise()
                back()
                drop()
                back()
                back()
            }
        }
        , 
        {
            sequence(2) {
                wait(11)
                grab()
                retract()
                wait(1)
                rotateClockwise()
                wait(1)
                rotateClockwise()
                back()
                back()
                retract()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                extend()
                reset()
            }
        }
        )
    }
}
