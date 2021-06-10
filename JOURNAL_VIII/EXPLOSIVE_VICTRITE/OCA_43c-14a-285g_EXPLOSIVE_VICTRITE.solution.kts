
solution {
    puzzle = "P100"
    name = "OCA (Copy)"
    arm(PISTON) {
        number = 1
        position = 3 to -3
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 1 to -4
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = -2
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 2 to -2
        rotation = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = 2 to -3
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -2
        rotation = 5
    }
    glyph(TRIPLEX_BONDER) {
        position = 2 to -3
        rotation = 8
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -3
        rotation = 6
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -2
        rotation = 10
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 1 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 2 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    track {
        position = 3 to -3
        positions = listOf(0 to 0, 1 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                extend()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                extend()
                pivotClockwise()
                rotateClockwise()
                forward()
                forward()
                drop()
                retract()
                wait(2)
                grab()
                rotateCounterClockwise()
                extend()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                rotateClockwise()
                extend()
                wait(1)
                grab()
                retract()
                rotateCounterClockwise()
                extend()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                extend()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
